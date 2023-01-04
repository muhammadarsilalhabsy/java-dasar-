package com.tutorial.latihan;

import java.util.Arrays;

public class PracticeArray {
  public static void main(String[] args) {
    int[] array1 = {4,3,2,5};
    int[] array2 = {9,1,7,2};

    System.out.println("\nSum Array");
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
    System.out.println("========== +");
    System.out.println(Arrays.toString(sumArray(array1,array2)));

    System.out.println("\nMerge Array");
    System.out.println(Arrays.toString(mergeArray(array1,array2)));

    System.out.println("\nReverse Array");
    int[] randomArray = Arrays.copyOf(mergeArray(array1,array2), mergeArray(array1,array2).length);
    Arrays.sort(randomArray);
    System.out.println("normal => " + Arrays.toString(randomArray));
    System.out.println("reverse => " +Arrays.toString(reverseArray(randomArray)));


    int[] sembarang = {5,2,9,1};
    System.out.println(Arrays.toString(reverseArray(sembarang)));
  }

  private static int[] sumArray(int[] array1, int[] array2){
    int[] result = new int[array1.length];
    for(int i = 0; i < array1.length; i++){
      result[i] = array1[i] + array2[i];
    }
    return result;
  }

  private static int[] mergeArray(int[] array1, int[] array2){
    int[] merge = new int[array1.length + array2.length];

    for(int i = 0; i < array1.length; i++){
      merge[i] = array1[i];
    }

    for (int i = 0; i < array2.length; i++){
      merge[i + array1.length] = array2[i];
    }
    return merge;
  }

  private static int[] reverseArray(int[] arraySort){
    int[] buffer = Arrays.copyOf(arraySort, arraySort.length);
    for(int i = 0; i < buffer.length; i++){
      arraySort[i] = buffer[(arraySort.length - 1) - i];
    }
    return arraySort;
  }
}


