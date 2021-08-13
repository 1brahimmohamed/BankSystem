package com.mycompany.banksystemoop;

import java.util.*;

enum accType {Normal, VIP}

    public class Account extends Client {
        public static Account[] Clients = new Account[10];
        Scanner input = new Scanner(System.in);

        private double balance;
        protected double creditLimit;
        protected double creditTaken;
        private boolean loanRequest;
        protected accType accountType;
        protected double lastDeposit;
        protected double lastWithdraw;


        public Account(){

        }
        public Account(String firstName, String lastName, String userName ,String password, String pin, String accountType,
                        String birthDate, String nationality, String nationalID, String address, String job,
                         String postalCode, double salary, String phoneNumber, String maritalStatus, boolean inDebitStatus,
                            boolean loanRequest, double balance, double lastDeposit, double lastWithdraw)
        {
            super(firstName,lastName,userName,password,pin,accountType,birthDate,nationality,nationalID,address,job,postalCode,salary,phoneNumber,maritalStatus,inDebitStatus);
            this.balance = balance;
            this.loanRequest = loanRequest;
            this.lastDeposit = lastDeposit;
            this.lastWithdraw = lastWithdraw;
        }

        public Account(String firstName, String lastName, String userName ,String password, String pin, String accountType,
                       String birthDate, String nationality, String nationalID, String address, String job,
                       String postalCode, double salary, String phoneNumber, String maritalStatus)
        {
            super(firstName,lastName,userName,password,pin,accountType,birthDate,nationality,nationalID,address,job,postalCode,salary,phoneNumber,maritalStatus);
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public boolean isLoanRequest() {
            return loanRequest;
        }

        public void setLoanRequest(boolean loanRequest) {
            this.loanRequest = loanRequest;
        }
        public boolean getLoanRequest() {
           return loanRequest;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public double getLastDeposit() {
            return lastDeposit;
        }
        public void setLastDeposit(double lastDeposit) {
            this.lastDeposit = lastDeposit;
        }

        public double getLastWithdraw() {
            return lastWithdraw;
        }
        public void setLastWithdraw(double lastWithdraw) {
            this.lastWithdraw = lastWithdraw;
        }

        public double getCreditTaken() {
            return creditTaken;
        }
        public void setCreditTaken(double creditTaken) {
            this.creditTaken = creditTaken;
        }



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

        public void withdraw (){

            System.out.println("Enter the amount to withdraw");
            double money = input.nextDouble();
            if(getBalance() >= money && money>=0)
            {
                setBalance(getBalance() - money);
            }
            else if(getBalance() < money) {
                System.out.println("Your balance is less than the required amount.");
            }
            else {
                System.out.println("Invalid Number.");
            }

        }

        public void transferAmount (){
            System.out.println("Enter the amount to transfer");
            double amount = input.nextDouble();
            if(getBalance()>=amount && amount>0){
                setBalance(getBalance() - amount);
            }

            else if(getBalance()< amount){
                System.out.println("Your balance is less than the required transfer amount.");
            }
            else {
                System.out.println("Invalid Number.");
            }
        }

        public void creditCard(){
            System.out.println("Enter the amount needed");
            double moneySpent = input.nextDouble();
            if(moneySpent<= getBalance()+1000 && moneySpent >0){ // limit per client
                if(moneySpent<=2000){
                    setBalance(getBalance() - moneySpent);
                }
                else{
                    System.out.println("Your maximum CreditCard withdraw is 2000 EGP.");
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