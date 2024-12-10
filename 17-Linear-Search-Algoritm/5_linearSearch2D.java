package com.day_2;

import java.util.Arrays;

public class _17_LinearSearchAlgo {

    public static int[] linearSearch2D1(int[][] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }

  

    public static int[] linearSearch2D2(int[][] arr, int target, boolean occurrence){

        int row = 0,  col = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    row = i;
                    col = j;
                }

                if (occurrence == false){
                    return  new int[] {row, col};
                }
            }
        }

        return  new int[] {row, col};
    }


    public static void main(String[] args) {

        int[][] array = {
                {1, 5, 7},
                {4, 5, 2},
                {1, 7, 9}
        };

        System.out.println("Element Found At Index ( first occurrence ) " + Arrays.toString(linearSearch2D2(array, 1, false)));
        System.out.println("Element Found At Index ( last occurrence )" + Arrays.toString(linearSearch2D2(array, 1, true)));

    }
}
