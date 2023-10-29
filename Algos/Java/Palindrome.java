package com.String.dsa;

public class Palindrome {
    public static boolean drome(String word ){
        for(int i=0 ; i<word.length()/2;i++){
            int n= word.length();
            if(word.charAt(i)!=word.charAt(n-1-i)) {
                System.out.println("The given word is not Palindrome ");
                return false;
            }
        }
        System.out.println("The given word is Palindrome");
        return true;
    }

    public static void main(String[] args){
        String word = "racecar";
        drome(word);
    }
}
