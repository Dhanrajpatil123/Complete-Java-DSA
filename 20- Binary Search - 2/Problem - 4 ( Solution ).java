package com.day_2;


public class _20_BinarySearch_Part_2 {


    public static int[] findRangeInInfiniteSortedArray1(int[] arr, int target){

        int start = 0;
        int end = 1;

        while (arr[end] < target){
            start = end;
            end = 2 * end;
        }

        return new int[]{start, end};
    }


    
    
    public static int binarySearchFirst(int[] arr, int target, int start, int end){

        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return ans;
    }

    
    
    
    
    public static String findFirstOccurrenceInArray(int[] arr){

        int[] result = findRangeInInfiniteSortedArray1(arr, 1);

        int first = binarySearchFirst(arr, 1, result[0], result[1]);

        if (first != 0)
            return "First occurrence is : " + first;

        return "Something went wrong";
    }

    
    
    

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};

        System.out.println(findFirstOccurrenceInArray(arr));
    }
    
    
}
