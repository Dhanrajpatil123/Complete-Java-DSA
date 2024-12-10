package com.day_2;

public class _17_LinearSearchAlgo {

    public static String linearSearch(int[] array, int target, boolean findLast){

        int result = -1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target){
                result = index;

                if (findLast == false){
                    break;
                }
            }
        }

        if (result == -1)
            return "Element Not found";
        else
            return "Element found at index : " + result;
    }



    public static void main(String[] args) {

        int[] array = {1, 5, 7, 4, 3, 2, 8, 10, 2, 1, 2};
        int target = 2;

        System.out.println("Element found at index : " + linearSearch(array, target, false));

        System.out.println("Element found at index : " + linearSearch(array, target, true));

    }
}
