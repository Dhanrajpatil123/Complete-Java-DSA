package com.day_2;

public class _18_BinarySearch {

    public static int solution1(int[] arr, int target, boolean isFirst){

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                ans = mid;

                if (isFirst){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 4, 4, 8, 12, 16};

        System.out.println("First Occurrence : " + solution1(arr, 4, true));

        System.out.println("Last Occurrence : " + solution1(arr, 4, false));
    }
}
