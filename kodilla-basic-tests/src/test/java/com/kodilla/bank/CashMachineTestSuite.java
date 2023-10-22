package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CashMachineTestSuite {
    
    @Test
    public void shouldHaveZeroLengthOfTranscations() {
        CashMachine cashMachine = new CashMachine();
        int [] values = cashMachine.getTransactions();
        assertEquals(0, values.length);
        assertEquals(0, cashMachine.getSize());
    }

    @Test
    public void shouldAddTwoTransactionsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(-400);

        int [] values = cashMachine.getTransactions();
        assertEquals(2, values.length);
        assertEquals(2, cashMachine.getSize());
        assertEquals(1000, values[0]);
        assertEquals(-400, values[1]);
        assertEquals(1, cashMachine.getPayInCount());
        assertEquals(1, cashMachine.getPayOutCount());
    }

    @Test
    public void shouldNotAddTranscationsForValueZero() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0);
        assertEquals(0, cashMachine.getSize());
    }

    @Test
    public void shouldCountBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(-400);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(800);

        assertEquals(1200, cashMachine.getBalance());
    }

    @Test
    public void shouldCountSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(-400);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(800);

        int expectedPayOutSum = 600;
        int expectedPayInSum = 1800;

        assertEquals(expectedPayInSum, cashMachine.getPayInSum());
        assertEquals(expectedPayOutSum, cashMachine.getPayOutSum());
    }
}
