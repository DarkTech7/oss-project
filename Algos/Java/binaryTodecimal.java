package com.method.dsa;

public class binaryTodecimal {
    public static void binTodec(int binnum){
        int mynumber = binnum;
        int pow = 0;
        int decnum = 0;
        while(binnum>0){
            int lastDigit = binnum%10;
            decnum = decnum +(lastDigit* (int)Math.pow(2,pow));
            pow++;
            binnum = binnum/10;
        }
        System.out.println("Decimal of "+ mynumber +" is "+decnum);
    }
    public static void main(String[] args){
        binTodec(1001);
    }
}
