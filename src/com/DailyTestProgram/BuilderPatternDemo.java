package com.DailyTestProgram;

public class BuilderPatternDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount.Builder(100).withOwner("vija").inTheBranch("Kormangala").build();

    }
}
//there will be private constrcutor
//static inner class,it will use this private constrcutor.
class BankAccount {
    private int accountNumber;
    private String owner;
    private double balance;
    private double interestRate;
    private String branch;

  /*  public BankAccount(int accountNumber, String owner, double balance, double interestRate, String branch) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.interestRate = interestRate;
        this.branch = branch;
    }*/
    private BankAccount(){}

    public static class Builder{
        private int accountNumber;
        private String owner;
        private double balance;
        private double interestRate;
        private String branch;

        public Builder(int accountNumber){
            this.accountNumber=accountNumber;
        }

        public Builder withOwner(String owner){
            this.owner=owner;
            return this;
        }

        public Builder InitialBalance(double balance){
            this.balance=balance;
            return this;
        }

        public Builder applyInterest(double interestRate){
            this.interestRate=interestRate;
            return this;
        }

        public Builder inTheBranch(String branch){
            this.branch=branch;
            return this;
        }

        public BankAccount build(){
            BankAccount bankAccount = new BankAccount();
            bankAccount.accountNumber=this.accountNumber;
            bankAccount.balance=this.balance;
            bankAccount.interestRate=this.interestRate;
            bankAccount.owner=this.owner;
            bankAccount.branch=this.branch;
            return bankAccount;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
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
}
