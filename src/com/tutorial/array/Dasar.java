package com.tutorial.array;

import java.util.Arrays;

public class Dasar {
  public static void main(String[] args) {

    // array assignment
    int[] array = {4, 8, 10, 12};

    int normalInteger = 2; // disimpan di memory stack
    System.out.println("Array location = " + array); // disimpan di memory heap
    System.out.println(Arrays.toString(array));
    System.out.println(normalInteger);

    // call array value
    System.out.println(array[3]);

    // array declaration
    float[] arrayFloat = new float[4]; // harus di declarasi

    System.out.println("\nBefore modification");
    printArray(arrayFloat);

    // modifikasi array
    arrayFloat[2] = 37.5f;

    System.out.println("\nAfter modification");
    printArray(arrayFloat);





  }
  private static void printArray(float[] arrayFloat){
    for(int i = 0; i < arrayFloat.length; i++){

      System.out.println(arrayFloat[i]);
    }
  }
  private static void printArray(int[] arrayInt){
    for(int i = 0; i < arrayInt.length; i++){

      System.out.println(arrayInt[i]);
    }
  }

}
