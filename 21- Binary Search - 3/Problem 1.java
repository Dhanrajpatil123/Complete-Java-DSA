/**
      Problem Statement : Given a bitonic array, find the minimum element.
      
        e.g. arr = [2, 4, 5, 11, 7, 5, 1]
             output = 1
  */


package com.day_2;

public class _21_BinarySearch_Part_3 {

    public static int bitonicArray(int[] arr){
        if (arr[0] < arr[arr.length-1]){
            return arr[0];
        }
        return arr[arr.length-1];
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 11, 7, 5, 1};

        System.out.println(bitonicArray(arr));
    }
}
