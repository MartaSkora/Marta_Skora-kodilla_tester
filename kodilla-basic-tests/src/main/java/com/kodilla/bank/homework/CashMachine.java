package com.kodilla.bank.homework;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {
    private int balance;
    private int[] transactions;
    private int size;
    private int payOutCount;
    private int payInCount;
    private int payOutSum;
    private int payInSum;

    public CashMachine() {
        this.balance = 0;
        this.transactions = new int[0];
        this.size = 0;
        this.payOutCount = 0;
        this.payInCount = 0;
        this.payOutSum = 0;
        this.payInSum = 0;
    }

    public void addTransaction(int value) {
        if(value == 0) {
            return; // czemu to nie ma nic?
        }
        if(value > 0 || balance >= value) {
            if(value > 0) {
                this.payInCount++;
                this.payInSum += value;
            } else {
                this.payOutCount++;
                this.payOutSum += value * -1;
            }

            this.size++;
            this.balance = this.balance + value;

            int[] newArray = new int[size];
            System.arraycopy(transactions, 0, newArray, 0, transactions.length);
            newArray[this.size - 1] = value;
            this.transactions = newArray;
        }

    }

    public int[] getTransactions() {

        return this.transactions;
    }
    public int getBalance() {

        return this.balance;
    }
    public int getSize() {

        return this.size;
    }
    public int getPayOutCount() {

        return this.payOutCount;
    }
    public int getPayInCount() {

        return this.payInCount;
    }
    public int getPayOutSum() {

        return this.payOutSum;
    }
    public int getPayInSum() {

        return this.payInSum;
    }

}
