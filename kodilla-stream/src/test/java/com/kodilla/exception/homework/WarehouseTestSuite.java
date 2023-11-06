package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    void shouldReturnSearchedOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        Order testOrder = new Order("A1");

        warehouse.addOrder(testOrder);
        warehouse.addOrder(new Order("A2"));
        warehouse.addOrder(new Order("A3"));

        Order result = warehouse.getOrder("A1");

        assertEquals(testOrder, result);
    }
    @Test
    void shouldReturnExceptionIfNoOrderFound() {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("A1"));
        warehouse.addOrder(new Order("A2"));
        warehouse.addOrder(new Order("A3"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("A4"));
    }
}