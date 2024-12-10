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


  // To insert an element at a specific position in array and shifting the existing elements to the right
  
    public static int[] insertatIndex(int[] array, int position, int element){
        
        if (array.length <= 0 || position > array.length-1){
            System.out.println("Something went wrong");
        }

        int[] newArray = new int[array.length + 1];

        for (int index = 0, j = 0; index < newArray.length; index++) {
            if (index == position){
                newArray[index] = element;
            }
            else {
                newArray[index] = array[j++];
            }
        }

        return newArray;
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
        System.out.println();
        printArray(insertatIndex(array, 3, 30));
    }
}
