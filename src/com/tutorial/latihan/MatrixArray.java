package com.tutorial.latihan;

import java.util.Arrays;

public class MatrixArray {
  public static void main(String[] args) {


    int[][] array1 = {{1, 2}, {3, 4,}};

    int[][] array2 = {{11, 12}, {13, 14}};

    System.out.println("\npenjumlahan");
    sum(array1, array2);

    int[][] array3 = {
            {1, 2},
            {3, 4},
            {8, 1}
    };

    int[][] array4 = {
            {11, 12},
            {13, 14}
    };
    // perkalian
    System.out.println("\nPerkalian");
    // jika a.b maka jumlah baris akan mengikuti matrix a
    // kolom akan mengikuti kolom b
    kali(array3, array4);


  }

  // perkalian
  private static void kali(int[][] array1, int[][] array2) {
    int[][] result = new int[array1.length][array2[0].length];
    int buffer;

    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2[0].length; j++) {
        buffer = 0;
        for (int k = 0; k < array1[0].length; k++) {
          buffer = buffer + array1[i][k] * array2[k][j];
        }
        result[i][j] = buffer;
      }
    }

    manualPrintArray2D(result);
  }

  // penjumlahan matrix
  private static void sum(int[][] array1, int[][] array2) {
    try {
      int a = array1.length;
      int aa = array1[0].length;
      int b = array2.length;
      int ba = array2[0].length;

      int[][] arrayTemp = Arrays.copyOf(array1, array1.length);

      if (a == b && aa == ba) {
        for (int i = 0; i < array1.length; i++) {
          for (int j = 0; j < array1[i].length; j++) {
            arrayTemp[i][j] = array1[i][j] + array2[i][j];
          }
        }
        manualPrintArray2D(arrayTemp);
      } else {
        System.out.println("Tidak sama");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Ada baris yang memiliki colum lebih banyak/sedikit dari pada yang lain!");
    }

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
      if (i != (array.length - 1)) {
        System.out.print(",\n");
      }
    }
    System.out.println("\n}");
  }


}
