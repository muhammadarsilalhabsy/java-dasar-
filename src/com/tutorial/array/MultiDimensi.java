package com.tutorial.array;

import java.util.Arrays;

public class MultiDimensi {
  public static void main(String[] args) {

    System.out.println("Array 2D");
    int[][] array2D = {{1, 2, 3, 4}, {5, 6, 7, 8}};
    printArray2D(array2D);

    System.out.println("\nDeklarasi Array 2D");

    //int [baris][kolom]
    int[][] deklarasiArray2D = new int[5][3];
    printArray2D(deklarasiArray2D);


    System.out.println("\nManual Loop Array 2D");
    manualPrintArray2D(deklarasiArray2D);

    System.out.println("\nForeach Loop Array 2D");
    foreachPrintArray2D(deklarasiArray2D);

    System.out.println("\nTest Array with value");
    int[][] arrayReal = {{5, 4, 3}, {9, 8, 7, 6}, {1, 2, 3, 4, 5, 6}, {10}};
    manualPrintArray2D(arrayReal);


  }

  private static void manualPrintArray2D(int[][] array) {
    System.out.println("{");
    for (int i = 0; i < array.length; i++) {
      System.out.print("\t{");
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j]);
        if (j != (array[i].length - 1)) {
          System.out.print(", ");
        }
      }
      System.out.print("}");
      if (i != (array.length) - 1) {
        System.out.print(",\n");
      }
    }
    System.out.println("\n}");
  }

  private static void foreachPrintArray2D(int[][] array) {
    for (int[] value : array) {
      System.out.print("[");
      for (int data : value) {
        System.out.print(data + ",");
      }
      System.out.print("]\n");
    }
  }

  private static void printArray2D(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(Arrays.toString(array[i]));
    }
  }

  private static void printArray3D(int[][][] array) {
    System.out.println(Arrays.deepToString(array));
  }
}
