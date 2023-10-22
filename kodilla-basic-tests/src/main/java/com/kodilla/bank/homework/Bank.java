package com.kodilla.bank.homework;

import java.util.List;

public class Bank {

    private int size;
    private CashMachine[] cashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newArray = new CashMachine[size];
        System.arraycopy(cashMachines, 0, newArray, 0, cashMachines.length);
        newArray[this.size - 1] = cashMachine;
        this.cashMachines = newArray;
    }

    public CashMachine[] getCashMachines() {
        return this.cashMachines;
    }

    public int getTotalBalance() {
        if(cashMachines.length == 0) {
            return 0;
        }
        int totalBalance = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            totalBalance += cashMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int getTotalPayOutCount() {
        if(cashMachines.length == 0) {
            return 0;
        }
        int totalPayOutCount = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            totalPayOutCount += cashMachines[i].getPayOutCount();
        }
        return totalPayOutCount;
    }

    public int getTotalPayInCount() {
        if(cashMachines.length == 0) {
            return 0;
        }
        int totalPayInCount = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            totalPayInCount += cashMachines[i].getPayInCount();
        }

        return totalPayInCount;
    }

    public double getTotalPayOutAverage() {
        if(cashMachines.length == 0 || getTotalPayOutCount() == 0) {
            return 0;
        }
        double totalPayOutSum = 0;
        for(int i = 0; i <cashMachines.length; i++) {
            totalPayOutSum += cashMachines[i].getPayOutSum();
        }
        return totalPayOutSum / getTotalPayOutCount();
    }

    public double getTotalPayInAverage() {
        if(cashMachines.length == 0 || getTotalPayInCount() == 0) {
            return 0;
        }
        double totalPayInSum = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            totalPayInSum += cashMachines[i].getPayInSum();
        }
        return totalPayInSum / getTotalPayInCount();
    }
}