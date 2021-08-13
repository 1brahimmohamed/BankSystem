package com.mycompany.banksystemoop;

import java.util.*;

public class VIP extends Account {
    static ArrayList<VIP> VIPClients=new ArrayList<VIP>();

    public VIP(){
        this.creditLimit = 12 * ((50.0/100) * this.salary);
    }

    public VIP(String firstname, String lastName, String username, String password, String pin, String accountType,
                  String birthday, String nationality, String nationalID, String address, String job, String postalCode,
                    double salary, String phoneNumber, String martialStatus, boolean debitStatus,
                        boolean loanRequest, double balance, double lastDeposit, double lastWithdraw){

        super(firstname,lastName,username,password,pin,accountType,birthday,nationality,nationalID,address,job,postalCode,
                salary,phoneNumber,martialStatus,debitStatus,loanRequest,balance,lastDeposit,lastWithdraw);

        this.creditLimit = 12 * ((50.0/100) * this.salary);
    }

    public VIP(String firstname, String lastName, String username, String password, String pin, String accountType,
               String birthday, String nationality, String nationalID, String address, String job, String postalCode,
               double salary, String phoneNumber, String martialStatus){

        super(firstname,lastName,username,password,pin,accountType,birthday,nationality,nationalID,address,job,postalCode,
                salary,phoneNumber,martialStatus);
        this.creditLimit = 12 * ((50.0/100) * this.salary);
    }

    public VIP(String firstname, String lastName, String username, long accountNumber, String password, String pin, String accountType,
               String birthday, String nationality, String nationalID, String address, String job, String postalCode,
               double salary, String phoneNumber, String martialStatus){

        super(firstname,lastName,username,password,pin,accountType,birthday,nationality,nationalID,address,job,postalCode,
                salary,phoneNumber,martialStatus);
        this.creditLimit = 12 * ((50.0/100) * this.salary);
        this.accountNumber = accountNumber;
    }

    @Override
    public void deposit(double amount){
            if (amount > 0) {
                setBalance(getBalance() + amount);
                setLastDeposit(amount);
                System.out.println("Operation complete");
            } else {
                System.out.println("Invalid Number.");
            }
        }

    @Override
    public void withdraw(){
        System.out.println("Enter the amount to withdraw");
        double money = input.nextDouble();

        if(getBalance() >= money && money<=50000 && money>=0)
        {
            setBalance(getBalance() - money);
            setLastWithdraw(money);
            System.out.println("Operation complete");
        }
        else if(money > 50000) {
            System.out.println("Maximum allowable amount is 50000 EGP ");
        }
        else if(getBalance() < money) {
            System.out.println("Your balance is less than the required amount.");
        }
        else {
            System.out.println("Invalid Number.");
        }
    }


    @Override
    public void transferAmount(){
        System.out.println("Enter the amount needed");
        double amount = input.nextDouble();
        if(getBalance()>=amount && amount<= 50000 && amount>0){
            setBalance(getBalance() - amount);
            System.out.println("Operation complete");
        }
        else if(amount >50000) {
            System.out.println("Maximum transfer amount allowed is 50000 EGP.");
        }
        else if(getBalance()< amount){
            System.out.println("Your balance is less than the required transfer amount.");
        }
        else {
            System.out.println("Invalid Number.");
        }
    }

    @Override
    public void creditCard(){
        System.out.println("Enter the amount needed");
        double moneySpent = input.nextDouble();
        if(moneySpent<= getBalance()+30000 && moneySpent >0){ // limit per client
            if(moneySpent<=50000){
                setBalance(getBalance() - moneySpent);
                System.out.println("Operation complete");
            }
            else{
                System.out.println("Your maximum CreditCard withdraw is 8000 EGP.");
            }
        }
        else if(moneySpent< 0) {
            System.out.println("Invalid Number.");
        }
        else{
            System.out.println("The amount you entered exceeds your allowable limit.");
        }
    }

}
