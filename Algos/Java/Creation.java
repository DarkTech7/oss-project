package com.Array2D.dsa;
import java.util.*;
public class Creation {
    public static boolean search(int[][] matrix, int key){
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.print("Key found at index = ("+  i +","+ j +")");
                    return true;
                }
            }

        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = new int[4][4];
        int n=4 ,m=4;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter the Key :- ");
        int key = sc.nextInt();

        search(matrix,key);

    }
}
