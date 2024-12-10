package com.day_2;

public class _17_LinearSearchAlgo {

    public static String linearSearch1(int[] array, int target){

        int result = -1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target)
                result = index;
        }

        if (result == -1)
            return "Element Not found";
        else
            return "Element found at index : " + result;
    }

    public static String linearSearch2(int[] array, int target){

        int result = -1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target)
                result = index;
        }

        if (result == -1)
            return "Element Not found";
        else
            return "Element found at index : " + String.valueOf(result);
    }

    public static String linearSearch3(int[] array, int target){

        int result = -1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target)
                result = index;
        }

        if (result == -1)
            return "Element Not found";
        else
            return "Element found at index : " + Integer.toString(result);
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 7, 4, 3, 2, 8, 10};
        int target = 2;

        System.out.println("Element found at index : " + linearSearch1(array, target));
        System.out.println("Element found at index : " + linearSearch2(array, target));
        System.out.println("Element found at index : " + linearSearch3(array, target));
    }
}
