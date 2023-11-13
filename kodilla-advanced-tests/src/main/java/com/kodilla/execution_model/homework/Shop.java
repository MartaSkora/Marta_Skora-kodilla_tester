package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersInRange(Date startDate, Date endDate) {
        List<Order> orderInRange = new ArrayList<>();
        for (Order order : orders) {
            if(order.getDate().after(startDate) && order.getDate().before(endDate))
                orderInRange.add(order);
        }

        return orders;
    }

    public List<Order> getOrdersBasedOnRange(double minValue, double maxValue) {
        List<Order> valueInRange = new ArrayList<>();
        for (Order order : orders) {
            if(order.getValue() > minValue && order.getValue() < maxValue)
                valueInRange.add(order);
        }

        return orders;
    }

    public int getOrdersSize() {
        return orders.size();
    }

    public double getOrdersTotal() {

        double sum = 0;

        for (Order order : orders) {
            sum += order.getValue();
        }
        return sum;
    }

}
