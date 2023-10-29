package com.Pattern.dsa;

public class invertedStar {
    public static void main (String[] args){
        // n = 4
        //i = line number
        //n-line+1
        int n = 4;
        for(int line = 1; line <= n; line++ ){
            for(int star = 1; star <= (n-line+1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
