package com.example.msku;

public interface BalanceChangingTest {
//Code that in this activity is written by Feyza Yılmaz.

    public int addBalanceWhenCanceled(int pastAmount, int addedAmount);
    public int  extractionBalance(int pastAmount, int extractAmount);

    public boolean isBalanceEnough(int currentAmount, int neededAmount);
}
