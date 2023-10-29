package com.Array2D.dsa;

public class DiagonalSum {

    public static int sum(int[][] numbers) {
        int sum = 0;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += numbers[i][j];
                }
                if (i != j) {
                    if (i + j == n - 1) {
                        sum += numbers[i][j];
                    }
                }
            }
        }
        return sum;
    }


//        int sum=0;
//        for(int i=0; i<numbers.length; i++){
//            sum+=numbers[i][i];
//            if(i!= numbers.length-1-i){
//                    sum+=numbers[i][numbers.length-1-i];
//            }
//        }
//
//        return sum;
//    }
    public static void main (String[] args){
        int[][] numbers={{1,2,3,4,17},
                        {5,6,7,8,18},
                        {9,10,11,12,19},
                        {13,14,15,16,20},
                        {21,22,23,24,25}};
        System.out.print("The Diagonal sum of the given matrix is = "+sum(numbers));
    }
}
