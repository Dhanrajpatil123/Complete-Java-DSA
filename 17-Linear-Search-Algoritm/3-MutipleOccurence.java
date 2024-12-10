package com.day_2;

import java.util.Arrays;

public class _17_LinearSearchAlgo { 

    public static void mutipleOccurence1(int[] array, int target){

        int[] result = new int[array.length];
        int k = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target){
                result[k++] = index;
            }
        }

        if (k == 0){
            System.out.println("Element is not present in array");
        }
        else{
            for (int i = 0; i < k; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

  

    public static int[] mutipleOccurence2(int[] array, int target){

        int[] result = new int[array.length];
        int k = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == target){
                result[k++] = index;
            }
        }

        if (k == 0){
            return null;
        }

        return Arrays.copyOf(result, k);

    }


    public static void main(String[] args) {

        int[] array = {1, 5, 7, 4, 3, 2, 8, 10, 2, 1, 2};
        int target = 2;

        System.out.println("Element found at index : " + Arrays.toString(mutipleOccurence2(array, target)));

    }
}
