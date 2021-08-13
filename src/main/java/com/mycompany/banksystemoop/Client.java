package com.mycompany.banksystemoop;


public class Client {
        protected String firstName;
        protected String password;
        protected String lastName;
        protected String accountType;
        protected String userName;
        protected String birthDate;
        protected String nationality;
        protected String nationalID;
        protected String Address;
        protected String Job;
        protected String postalCode;
        protected long accountNumber = 0;
        protected double salary;
        protected String pin ;
        protected String phoneNumber;
        protected String maritalStatus;
        protected boolean inDebitStatus;




        public Client(){

        }
        public Client(String firstName, String lastName, String userName, String password, String pin, String accountType,
                        String birthDate, String nationality, String nationalID, String address, String job, String postalCode,
                            double salary, String phoneNumber, String maritalStatus, boolean inDebitStatus)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
            this.pin = pin;
            this.accountType = accountType;
            this.birthDate = birthDate;
            this.nationality = nationality;
            this.nationalID = nationalID;
            this.Address = address;
            this.Job = job;
            this.accountNumber = Math.round(Math.random()*(999999999));
            this.postalCode = postalCode;
            this.salary = salary;
            this.phoneNumber = phoneNumber;
            this.maritalStatus = maritalStatus;
            this.inDebitStatus = inDebitStatus;
        }
        public Client(String firstName, String lastName, String userName, String password, String pin, String accountType,
                        String birthDate, String nationality, String nationalID, String address, String job, String postalCode,
                            double salary, String phoneNumber, String maritalStatus) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
            this.pin = pin;
            this.accountType = accountType;
            this.birthDate = birthDate;
            this.nationality = nationality;
            this.nationalID = nationalID;
            this.Address = address;
            this.Job = job;
            this.accountNumber = Math.round(Math.random()*(999999999));
            this.postalCode = postalCode;
            this.salary = salary;
            this.phoneNumber = phoneNumber;
            this.maritalStatus = maritalStatus;
    }


        /**
          Setters and Getters for the Attributes
         **/

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }

        public String getAccountType() {
            return accountType;
        }
        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public String getUserName() {
            return userName;
        }
        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getBirthDate() {
            return birthDate;
        }
        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getNationality() {
            return nationality;
        }
        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getNationalID() {
            return nationalID;
        }
        public void setNationalID(String nationalID) {
           this.nationalID = nationalID;
        }

        public String getAddress() {
            return Address;
        }
        public void setAddress(String address) {
            Address = address;
        }

        public String getJob() {
            return Job;
        }
        public void setJob(String job) {
            Job = job;
        }

        public String getPostalCode() {
            return postalCode;
        }
        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public long getAccountNumber() {
            return accountNumber;
        }
        public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

        public String getPin() {
            return pin;
        }
        public void setPin(String pin) {
            this.pin = pin;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getMaritalStatus() {
            return maritalStatus;
        }
        public void setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
        }

        public boolean isInDebitStatus() {
            return inDebitStatus;
        }
        public void setInDebitStatus(boolean inDebitStatus) {
            this.inDebitStatus = inDebitStatus;
        }

        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
}
