package com.day_2;


public class _20_BinarySearch_Part_2 { 


    public static int[] findRangeInInfiniteArrray(int[] arr, int target){

        int[] range = new int[2];

        int start = 0;
        int end = 1;

        while (arr[end] < target){
            start = end;
            end = 2*end;
        }

        range[0] = start;
        range[1] = end;

        return range;
    }


    public static int binarySearchInRange(int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

     
    
    
    
    
    
    public static void main(String[] args) {

        int[] arr = {2, 2, 4, 5, 7, 9, 25, 56, 88, 94};

        int[] range = findRangeInInfiniteArrray(arr, 10);
 
        int result = binarySearchInRange(arr, 10, range[0], range[1]);


    }
    
    
    
}
