package com.method.dsa;

public class prime {
    //public static boolean isPrime(int n){
      //  if(n==2){
        //    return true;
        //}
        //for(int a = 2; a<=n-1; a++){
          //  if (n%a==0){
            //    return false ;
            //}
        //}
        //return true;
    //}
    //public static void main(String[] args){
      //  System.out.println(isPrime(2));
    //}

    public static boolean isPrime(int n){
        if (n== 2){
            return true;
        }
        for(int a = 2; a<=Math.sqrt(n); a++)
            if(n%a==0){
                return false;
            }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(13));
    }
}
