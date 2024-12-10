package com.day_2;

import java.util.Arrays;

public class _17_LinearSearchAlgo {

    public static int findMax(int[] arr){

        int max = Integer.MIN_VALUE;

        for (int x : arr){
            if (max < x){
                max = x;
            }
        }
        return max;
    }


      public static int findMin(int[] arr){

        int min = Integer.MAX_VALUE;

        for (int x : arr){
            if (min > x){
                min = x;
            }
        }
        return min;
    }


    public static void main(String[] args) {

        int[] array = {1, 5, 7, 4, 3, 2, 8, 10, 2, 1, 2};

        System.out.println("Max : " + findMax(array));

       System.out.println("Max : " + findMin(array));

    }
}
