package com.day_2;

import java.util.Scanner;

public class Main {

    public static void printArray(int[] array){

        for (int x = 0; x < array.length; x++){
            System.out.print(array[x]);

            if (array.length-1 != x){
                System.out.print(", ");
            }
        }
    }
 

    public static int[] deleteElement(int[] array, int position){

        if (array.length <= 0 || position > array.length-1){
            System.out.println("Something went Wrong...");
        }

        for (int index = position; index <= array.length-2 ; index++) {
            array[index] = array[index+1];
        }

        array[array.length-1] = 0;

        return array;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");

        int[] array = new int[sc.nextInt()];

        for (int index = 0; index < array.length; index++) {
            System.out.print("Enter element : ");
            array[index] = sc.nextInt();
        }

        printArray(array);
        deleteElement(array, 3);
        System.out.println();
        printArray(array);
    }
}
