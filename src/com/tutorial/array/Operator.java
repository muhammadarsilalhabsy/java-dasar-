package com.tutorial.array;

import java.util.Arrays;

public class Operator {
  public static void main(String[] args) {
    int[] array = {11, 21, 13, 41, 15};
    int[] array1 = new int[array.length];

    printArray(array);
    printArray(array1);

    System.out.println("\nCopy menggunakan array");
    copyArray(array, array1);

    printArray(array);
    printArray(array1);
    compareArray(array, array1);

    System.out.println("\nCopy menggunakan method copyOf");
    int[] array2 = Arrays.copyOf(array1, array1.length);

    printArray(array1);
    printArray(array2);
    compareArray(array2, array1);

    System.out.println("\nCopy menggunakan method copyOfRange");
    int[] array3 = Arrays.copyOfRange(array2, 2, array2.length);
    printArray(array3);

    System.out.println("\nFill array method fill");
    int[] array4 = new int[10];
    printArray(array4);
    Arrays.fill(array4, 7);
    printArray(array4);

    System.out.println("\nCompare array value menggunakan method Arrays.equals");
    int[] array5 = {1,2,3,4,5};
    int[] array6 = {1,2,3,4,5};

    if (Arrays.equals(array5, array6)) {
      System.out.println("Data yang didalamnya sama!");
    } else {
      System.out.println("Data yang didalamnya tidak sama!");
    }

    System.out.println("\nMengecek mana array yang lebih besar, sama = 0, kiri = 1, kanan = -1");
    int[] array7 = {1,2,3,2,5};
    System.out.println(Arrays.compare(array6, array7));

    System.out.println("\nMengecek index yang berbeda");
    System.out.println(Arrays.mismatch(array6, array7));

    System.out.println("\nSort array");
    int[] randomArray = {6,3,4,8,5,1,9,2,1,3};
    Arrays.sort(randomArray);
    printArray(randomArray);

    System.out.println("\nSearch array");
    int key = 5;
    int position = Arrays.binarySearch(randomArray,key);
    System.out.printf("key %d, ada di index ke %d\n",key, position);



  }

  private static void printArray(int[] arrayInt) {
    System.out.printf("Array = %s, with Address = %s\n", Arrays.toString(arrayInt), arrayInt);
  }

  private static void copyArray(int[] from, int[] to) {
    System.arraycopy(from, 0, to, 0, from.length);
  }

  private static void compareArray(int[] first, int[] second) {
    boolean compare = first == second;
    System.out.printf("%s == %s => %s\n", first, second, compare);
  }
}
