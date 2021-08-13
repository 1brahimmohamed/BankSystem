package com.mycompany.banksystemoop;

import java.util.regex.*;

public class DataValidator {

    // The CheckNationalID Method Checks if the National ID is 14 Digit and contains only numbers
    public static boolean CheckNationalID(String nationalID) {
        if(nationalID.length()==14){
            for(int i=0; i<nationalID.length(); i++){
                if(nationalID.charAt(i)<'0' || nationalID.charAt(i)>'9'){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    // The CheckPhoneNumber Method Checks if the Phone Number is 11 Digit and contains only numbers
    public static boolean CheckPhoneNumber(String PhNum) {
            if(PhNum.length()==11){
                for(int i=0; i<PhNum.length(); i++){
                    if(PhNum.charAt(i)<'0' || PhNum.charAt(i)>'9'){
                        return false;
                    }
                }
                return true;
            }
            else {
                return false;
            }
        }

    // The CheckPin Method Checks if the PIN Number is 4 Digit and contains only numbers
    public static boolean CheckPin(String Pin) {
        if(Pin.length()==4){
            for(int i=0; i<Pin.length(); i++){
                if(Pin.charAt(i)<'0' || Pin.charAt(i)>'9'){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    // The CheckPostalCode Method Checks if the Postal Code is 5 Digit and contains only numbers
    public static boolean CheckPostalCode(String PostalC) {
        if(PostalC.length()==5){
            for(int i=0; i<PostalC.length(); i++){
                if(PostalC.charAt(i)<'0' || PostalC.charAt(i)>'9'){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    // The CheckName Method Checks if the Name contains numbers
    public static boolean CheckName(String Name) {

        Pattern p = Pattern.compile("[^A-Za-z]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(Name);
        boolean b = m.find();

        if (b)
            return false;

        return true;
    }

}

