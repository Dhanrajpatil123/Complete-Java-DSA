package com.day_2;

import java.util.Arrays;

    /**
     *
     * @param arr
     * @param target
     * @return
     *
     * we need to find the number of occurrence of an element in sorted array
     */
    public static int countOccurrence(int[] arr, int target, boolean ifFirst){

        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while (start <= end){

            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                result = mid;

                if (ifFirst){
                    end = mid - 1;
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

        return result;
    }

    public static int problem2(int[] arr, int target){

        int firstOcc = countOccurrence(arr, target, true);
        int lastOcc = countOccurrence(arr, target, false);

        if (firstOcc == -1 && lastOcc == -1)
            return 0;

        return (lastOcc - firstOcc) + 1;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 4, 4, 5, 6, 7, 8, 9};

        System.out.println("First & Last Occurrence : " + problem2(arr, 4));

    }
}
