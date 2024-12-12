package com.day_2;

import java.util.Arrays;

public class _19_Interview_Que {

    public static int binarySearchCeil(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start <= end){

            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                ans = arr[mid];
                return ans;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
                ans = arr[mid];
            }

        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};

        System.out.println("First & Last Occurrence : " + binarySearchCeil(arr, 17));

    }
}
