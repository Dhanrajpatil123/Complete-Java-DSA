package com.day_2;


public class _20_BinarySearch_Part_2 {

    public static int findMinimumAbsoluteDifference(int[] arr, int target){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                ans = mid;
                break;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // if element exist then ans will be zero
        int res = 0;

        // element does not exist
        if (ans == -1){

            if (end == -1){
                res = Math.abs(target - arr[start]);
            }
            else if (start == arr.length){
                res = Math.abs(target - arr[end]);
            }
            else{
                int ans1 = Math.abs(target - arr[start]);
                int ans2 = Math.abs(target - arr[end]);
                res = Math.min(ans1, ans2);
            }
        }

        return res;
    }



    public static void main(String[] args) {

        int[] arr = {2, 2, 4, 5, 7, 9, 25, 56, 88, 94};
 
        System.out.println(findMinimumAbsoluteDifference(arr, 100));
    }
}
