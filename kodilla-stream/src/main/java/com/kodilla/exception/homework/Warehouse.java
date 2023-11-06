package com.kodilla.exception.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Warehouse {

    private Map<String, Order> warehouseOrders;
    public Warehouse() {
        this.warehouseOrders = new HashMap<>();
    }

    public void addOrder(Order order) {
        warehouseOrders.put(order.getNumber(), order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> optionalOrder = warehouseOrders.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(number))
                .map(Map.Entry::getValue)
                .findFirst();

        // return optionalOrder.orElseThrow(OrderDoesntExistException::new);
        return optionalOrder.orElseThrow(() -> new OrderDoesntExistException());
    }
 }
