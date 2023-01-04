package com.tutorial.array;

public class PassByReference {
  public static void main(String[] args){

    System.out.println("Array Pass by references");
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = new int[3];

    System.out.println("\nLokasi");
    System.out.println(array1);
    System.out.println(array2);
    System.out.println(array1 == array2); // false


    System.out.println("\nArray 1");
    printArray(array1);
    System.out.println("\nArray 2");
    printArray(array2);

    array2 = array1; // ini tidak mencopy

    System.out.println("\nLokasi");
    System.out.println(array1);
    System.out.println(array2);
    System.out.println(array1 == array2); // true

    System.out.println("\nArray 1");
    printArray(array1);
    System.out.println("\nArray 2");
    printArray(array2);

    System.out.println("\nArray 3, mengubah index 0 = 10");
    ubahArray(array1);

    System.out.println("\nArray 1");
    printArray(array1);
    System.out.println("\nArray 2");
    printArray(array2);


  }
  private static void printArray(int[] array){
    for(int data: array){
      System.out.println(data);
    }
  }

  private static void ubahArray(int[] newArray){
    newArray[0] = 10;
  }
}
