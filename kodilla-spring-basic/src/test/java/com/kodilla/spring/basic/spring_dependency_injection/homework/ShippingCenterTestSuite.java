package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessIfPackageWasSent() {
        String result = shippingCenter.sendPackage("Address 1", 20);
        assertEquals("Package delivered to: Address 1", result);
    }

    @Test
    public void shouldReturnFailIfPackageWasNotSent() {
        String result = shippingCenter.sendPackage("Address 1", 40);
        assertEquals("Package not delivered to: Address 1", result);
    }

    @Test
    public void shouldReturnSuccessIfPackageWasSentForEdgeValue() {
        String result = shippingCenter.sendPackage("Address 1", 30);
        assertEquals("Package delivered to: Address 1", result);
    }

}