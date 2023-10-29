package com.method.dsa;
import java.util.Scanner;
public class multiplicatiion {
    public static int product(int a, int b){
        int c = a * b;
        return c;
    }
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 :- ");
        int num2 = sc.nextInt();
        System.out.print("Product of num1 and num2 is "+product(num1, num2 ));


    }
}
