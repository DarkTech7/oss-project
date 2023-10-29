package com.method.dsa;

public class decimalTobinary {
    public static void dectobin(int decnum){
        int mynumber = decnum;
        int binnum = 0;
        int pow = 0;
        while(decnum>0){
            binnum = binnum + ((decnum%2)*(int)Math.pow(10,pow));
            pow++;
            decnum = decnum/2;
        }
        System.out.println("The binary of " + mynumber + " is " +binnum);
    }
    public static void main (String[] args ){
        dectobin(15);
    }
}
