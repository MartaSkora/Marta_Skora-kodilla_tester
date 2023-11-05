package com.kodilla.exception.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Warehouse {

    private Map<String, Order> warehouseOrders;
    public Warehouse() {
        this.warehouseOrders = new HashMap<>();
    }

    public void addOrder(Order order) {
        warehouseOrders.put(order.getNumber(), order);
    }
    public Order getOrder (String number) throws OrderDoesntExistException {
        List<Order> ordersToReturn = warehouseOrders.entrySet()
                .stream()
                .filter(order -> order.getKey().equals(number))
                .map(order -> order.getValue())
                .collect(Collectors.toList());
        if (ordersToReturn.size() > 0)
            return ordersToReturn.get(0);
        throw new OrderDoesntExistException();
    }
 }
