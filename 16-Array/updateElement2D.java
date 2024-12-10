package com.day_2;

import java.util.Scanner;

public class MyArray {

    public static void print2DArray(int[][] array){
        for (int[] x : array){
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    } 

    public static int[][] updateElement2D(int[][] array, int position1, int position2, int element){

        if (position1 > array.length-1 || position1 < 0 || position2 >= array[position1].length){
            System.out.println("Invalid Input");
        }

        array[position1][position2] = element;

        return array;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[3][3];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        print2DArray(array);
        System.out.println("----------");
        print2DArray(updateElement2D(array, 1, 1, 100));

    }
}
