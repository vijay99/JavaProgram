package com.concept;

public class BuilderPattern {
    public static void main(String[] args) {
        // BankAccount account1= new BankAccount(101l,"Amit",2000.00,3.00,"Deoghar");
        // BankAccount account2= new BankAccount(909l,"Summit",7.00,9000.00,"Bangalore");
       /* Thus, there are two specific problems that we need to solve:

        Too many constructor arguments.
        Incorrect object state.
                This is where the Builder pattern comes into play.*/


        //Builder patter
        BankAccount bankAccount = new BankAccount.Builder(989l)
                .withOwner("Gangadhaar").build();


    }
}


/*
class BankAccount {
    private long accountNumber;
    private String owner;
    private double balance;
    //New requirement to add interest rate and branch name
    private double interestRate;
    private String branch;

    public BankAccount(long accountNumber, String owner, double balance,double interestRate,String branch ) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.interestRate=interestRate;
        this.branch=branch;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}*/

class BankAccount {

    public static class Builder {
        private long accountNumber;
        private String owner;
        private double balance;
        private double interestRate;
        private String branch;

        public Builder(long accountNumber){
            this.accountNumber=accountNumber;
        }
        public Builder withOwner(String owner){
            this.owner=owner;
            return this; //By returning builder each time we can create fluent interface
        }

        public Builder openingBalance(double balance){
            this.balance=balance;
            return this;
        }

        public Builder atRate(double interestRate){
            this.interestRate=interestRate;
            return this;
        }

        public Builder atBranch(String branch){
            this.interestRate=interestRate;
            return this;
        }

        public BankAccount build(){
            //Here we create the actual bank account object,which is always in a fully initialised state when it's returned
            BankAccount bankAccount = new BankAccount(); //since the builder is in the BankAccount class ,we can invoke it's private constructor
            bankAccount.accountNumber = this.accountNumber;
            bankAccount.balance=this.balance;
            bankAccount.owner= this.owner;
            bankAccount.interestRate=this.interestRate;
            bankAccount.branch=this.branch;
            return bankAccount;
        }
    }

    //private constructor

    private BankAccount(){

    }
    private long accountNumber;
    private String owner;
    private double balance;
    private double interestRate;
    private String branch;
}
