package com.Array2D.dsa;

public class SpiralMatrix {
    public static void Spiral(int[][] numbers){
        int startRow=0;
        int startColumn=0;
        int endRow= numbers.length-1;
        int endColumn = numbers[0].length-1;

        while(startRow<=endRow && startColumn<=endColumn){
            //TOP
            for(int i =startColumn; i<=endColumn; i++){
                System.out.print(numbers[startRow][i]+" ");
            }
            //RIGHT
            for(int j=startRow+1; j<=endRow; j++){
                System.out.print(numbers[j][endColumn]+" ");
            }
            //BOTTOM
            for(int i=endColumn-1; i>=startColumn; i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(numbers[endRow][i]+" ");
            }
            //LEFT
            for(int j=endRow-1; j>=startRow+1; j--){
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(numbers[j][startColumn]+" ");
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[][] numbers ={{1,2,3,4,15},
                         {5,6,7,8,19},
                         {9,10,11,12,13}};


        int[][] numbers2={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        Spiral(numbers);

    }
}
