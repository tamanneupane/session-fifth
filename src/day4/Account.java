package day4;

import java.util.logging.Logger;

//src:day4.*

public class Account {

    public static final float INTEREST_RATE = 0.05f;

    // accountNumber
    // accountHolderName
    // accountBalance
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    private void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // deposit
    public void deposit(double amount){
        Logger.getGlobal().info(this.accountHolderName);
        Logger.getGlobal().info(this.accountNumber);
        this.accountBalance += amount;
    }


    // transferBalance
    public void transferBalance(Account fromAccount , double amountToBeTransferred){
        //TODO check if sufficient balance to be transferred is available or not
        fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amountToBeTransferred);
        this.setAccountBalance(this.getAccountBalance() + amountToBeTransferred);
    }

    // addInterest
    public void addInterest(){
        double interest = (this.getAccountBalance() * 1 * INTEREST_RATE);
        System.out.println("Principal Amount : " + this.getAccountBalance());
        System.out.println(String.format("Interest Amount : %8.2f", interest));
        this.setAccountBalance(this.getAccountBalance() + interest);
        System.out.println(String.format("Account Balance: %8.4f",this.getAccountBalance()));
    }

    //private
}
