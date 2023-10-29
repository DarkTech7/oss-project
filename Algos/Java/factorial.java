package com.method.dsa;
import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        int f = 1;
        for (int a = 1 ; a<=n ; a++){
          f *=a;
        }
        return f;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :- ");
        int number = sc.nextInt();
        System.out.println("The factorial of the entered number is " + fact(number) );
    }
}
