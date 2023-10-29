package com.method.dsa;
import java.util.Scanner;
public class bionomialCoefficient{
    public static int fact(int a){
        int f =  1;
        for(int b = 1; b<= a; b++){
            f *= b;
        }
        return f;
    }
    public static int bioCo(int x , int y){
        int factx = fact(x);
        int facty = fact(y);
        int factz = fact(x-y);
         int Bio_Coe = factx /(facty*(factz));
         return Bio_Coe;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n :- ");
        int n = sc.nextInt();
        System.out.print("Enter r :- ");
        int r = sc.nextInt();
        System.out.println("The Bionomial Coefficient is  " + bioCo(n , r));
    }

}
