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

    // Delete an element from the 2D array
    public static int[][] deletElement2D(int[][] array, int position1, int position2) {
        if (position1 < 0 || position1 >= array.length || position2 < 0 || position2 >= array[position1].length) {
            System.out.println("Invalid position");
            return array;
        }

        for (int row = position1; row < array.length; row++) {
            for (int col = (row == position1 ? position2 : 0); col < array[row].length - 1; col++) {
                array[row][col] = array[row][col + 1];
            }
            if (row < array.length - 1) {
                array[row][array[row].length - 1] = array[row + 1][0];
            }
        }

        array[array.length - 1][array[0].length - 1] = 0;
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
        print2DArray(deletElement2D(array, 1, 1));

    }
}
