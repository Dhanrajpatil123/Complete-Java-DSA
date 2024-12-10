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


    public static void insertElementIn2DArray(int[][] array, int pos1, int pos2, int element){
    
    insertElement(array[pos1], element, pos2);

    }


    
    public static int[][] insertElement2D(int[][] array, int position1, int position2, int element){

        if (array.length <= 0 || position1 > array.length){
            System.out.println("Something went wrong");
        }

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row == position1 && col == position2){
                    array[position1][position2] = element;
                    break;
                }
            }
        }

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
        print2DArray(insertElement2D(array, 1, 2, 100));

    }
}
