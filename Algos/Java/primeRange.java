package com.method.dsa;

public class primeRange {
    public static boolean isPrime(int n){
        if (n==2) {
            return true;
        }
            for(int a = 2; a<=Math.sqrt(n); a++){
                if(n%a==0){
                    return false;
                }
            }
            return true;
    }
    public static void range(int p){
        for(int x = 2; x<=p; x++){
            if(isPrime(x)){
                System.out.print(x+",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        range(40);
    }
}
