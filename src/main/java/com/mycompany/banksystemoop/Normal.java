package com.mycompany.banksystemoop;

import java.util.*;

public class Normal extends Account {

    Scanner input = new Scanner(System.in);

    static ArrayList<Normal> NormalClients =new ArrayList<Normal>();

    public Normal(){
        this.creditLimit = 12 * ((40.0/100) * this.salary);
    }
    public Normal(String firstname, String lastName, String username, String password, String pin, String accountType,
                    String birthday, String nationality, String nationalID, String address, String job, String postalCode
                        , double salary, String phoneNumber, String martialStatus, boolean debitStatus,
                            boolean loanRequest, double balance, double lastDeposit, double lastWithdraw){

        super(firstname,lastName,username,password,pin,accountType,birthday,nationality,nationalID,address,job,postalCode,
                salary,phoneNumber,martialStatus,debitStatus,loanRequest,balance,lastDeposit,lastWithdraw);
        this.creditLimit = 12 * ((40.0/100) * this.salary);
    }

    public Normal(String firstname, String lastName, String username, String password, String pin, String accountType,
                    String birthday, String nationality, String nationalID, String address, String job, String postalCode,
                        double salary, String phoneNumber, String martialStatus){

        super(firstname,lastName,username,password,pin,accountType,birthday,nationality,nationalID,address,job,postalCode,
                salary,phoneNumber,martialStatus);
        this.creditLimit = 12 * ((40.0/100) * this.salary);
    }

    public Normal(String firstname, String lastName, String username, Long accountNumber,String password, String pin, String accountType,
                  String birthday, String nationality, String nationalID, String address, String job, String postalCode,
                  double salary, String phoneNumber, String martialStatus){

        super(firstname,lastName,username,password,pin,accountType,birthday,nationality,nationalID,address,job,postalCode,
                salary,phoneNumber,martialStatus);
        this.accountNumber = accountNumber;
        this.creditLimit = 12 * ((40.0/100) * this.salary);
    }

    @Override
    public void deposit(double amount){
        if(amount>=100 && amount > 0){
            setBalance(getBalance()+amount);
            setLastDeposit(amount);
        }
        else if(amount <100){
            System.out.println("Minimum deposit allowed is 100 EGP.");
        }
        else {
            System.out.println("Invalid Number.");
        }

    }

    @Override
    public void withdraw (){

            System.out.println("Enter the amount needed");
        double money = input.nextDouble();
        if(getBalance() >= money && money<=10000 && money>=0)
        {
            setBalance(getBalance() - money);
            setLastWithdraw(money);
            System.out.println("Operation complete");
        }
        else if(money >10000) {
            System.out.println("Maximum allowable amount is 10000 EGP. ");
        }
        else if(getBalance() < money) {
            System.out.println("Your balance is less than the rquired amount.");
        }
        else {
            System.out.println("Invalid Number.");
        }

    }

    public void TransferAmount(){
        System.out.println("Enter the amount needed");
        double amount = input.nextDouble();

        if(getBalance()>=amount && amount<=20000 && amount>0){
            System.out.println("Enter the acocunt number you want to transfer to: ");
            String transferedAccNumber = input.next();
            setBalance(getBalance()-amount);
            System.out.println("Operation complete");
        }
        else if(amount >20000) {
            System.out.println("Maximum transfer amount allowed is 20000 EGP.");
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

        if(moneySpent<= getBalance()+5000 && moneySpent >0){ // limit per client
            if(moneySpent<=10000){
                setBalance(getBalance() - moneySpent);
                System.out.println("Operation complete");
            }
            else{
                System.out.println("Your maximum CreditCard withdraw is 10000 EGP.");
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