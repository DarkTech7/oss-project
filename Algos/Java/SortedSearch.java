package com.Array2D.dsa;
import java.util.Scanner;
public class SortedSearch {
    public static boolean Search(int[][] numbers, int key) {
        int row=0 ,col=numbers[0].length-1;

        while(row<numbers.length && col>=0){
            if(numbers[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if(key<numbers[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found in the given matrix");
        return false;
    }

    public static void main(String[] args){
        int[][] numbers ={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key = ");
        int key = sc.nextInt();
        Search(numbers,key);
    }
}
