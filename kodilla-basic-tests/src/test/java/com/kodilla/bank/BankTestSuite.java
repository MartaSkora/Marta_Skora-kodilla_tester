package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLengthOfCashMachines() {
        Bank bank = new Bank();
        assertEquals(0, bank.getCashMachines().length);
    }

    @Test
    public void ShouldAddThreeCashMachines() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine();
        CashMachine machineTwo = new CashMachine();
        CashMachine machineThree = new CashMachine();
        bank.addCashMachine(machineOne);
        bank.addCashMachine(machineTwo);
        bank.addCashMachine(machineThree);
        assertEquals(3, bank.getCashMachines().length);
    }
    @Test
    public void shouldReturnTotalBalance() {

        Bank bank = new Bank();

        CashMachine machineOne = new CashMachine();
        machineOne.addTransaction(400);
        machineOne.addTransaction(500);
        machineOne.addTransaction(600);

        CashMachine machineTwo = new CashMachine();
        machineTwo.addTransaction(1400);
        machineTwo.addTransaction(-600);
        machineTwo.addTransaction(-50);

        CashMachine machineThree = new CashMachine();

        bank.addCashMachine(machineOne);
        bank.addCashMachine(machineTwo);
        bank.addCashMachine(machineThree);

        assertEquals(2250, bank.getTotalBalance());

    }

    @Test
    public void shouldReturnTotalCount() {

        Bank bank = new Bank();

        CashMachine machineOne = new CashMachine();

        machineOne.addTransaction(400);
        machineOne.addTransaction(500);
        machineOne.addTransaction(600);

        CashMachine machineTwo = new CashMachine();
        machineTwo.addTransaction(1400);
        machineTwo.addTransaction(-600);
        machineTwo.addTransaction(-50);

        CashMachine machineThree = new CashMachine();

        bank.addCashMachine(machineOne);
        bank.addCashMachine(machineTwo);
        bank.addCashMachine(machineThree);

        assertEquals(2, bank.getTotalPayOutCount());
        assertEquals(4, bank.getTotalPayInCount());

    }

    @Test
    public void shouldReturnTotalAverages() {

        Bank bank = new Bank();

        CashMachine machineOne = new CashMachine();
        machineOne.addTransaction(400);
        machineOne.addTransaction(500);
        machineOne.addTransaction(600);

        CashMachine machineTwo = new CashMachine();
        machineTwo.addTransaction(1400);
        machineTwo.addTransaction(-600);
        machineTwo.addTransaction(-50);

        CashMachine machineThree = new CashMachine();

        bank.addCashMachine(machineOne);
        bank.addCashMachine(machineTwo);
        bank.addCashMachine(machineThree);

        assertEquals(325, bank.getTotalPayOutAverage());
        assertEquals(725, bank.getTotalPayInAverage());
    }

    @Test
    public void shouldReturnZeroTotalAveragesForNoneTranscations() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine();
        CashMachine machineTwo = new CashMachine();
        CashMachine machineThree = new CashMachine();
        bank.addCashMachine(machineOne);
        bank.addCashMachine(machineTwo);
        bank.addCashMachine(machineThree);

        assertEquals(0, bank.getTotalPayOutAverage());
        assertEquals(0, bank.getTotalPayInAverage());
    }

}
