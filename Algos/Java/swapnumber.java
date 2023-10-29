package com.method.dsa;
import java.util.Scanner;
public class swapnumber {
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("The value of num1 after swapping is "+ a);
        System.out.println("The value of num2 after swapping is "+ b);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        swap(num1,num2);


    }
}
