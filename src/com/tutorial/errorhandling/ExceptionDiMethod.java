package com.tutorial.errorhandling;

import java.util.Scanner;

public class ExceptionDiMethod {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Masukan index array: ");
    int data = input.nextInt();

    int[] array = {4,9,5,6,2};


    System.out.println("\nTry Catch Di Method");
    int value = ambilDataArray(array, data);
    System.out.printf("array index ke %d, adalah %d\n", data, value);

    System.out.println("\n\nThrow Exception dari Method");
    int result = 0;
    try{
      result = ambilData(array, data);
    }catch (Exception e){
      System.err.println(e);
    }
    System.out.printf("array index ke %d, adalah %d\n", data, result);



    System.out.println("Programm selesai");



  }
  private static int ambilData(int[] array, int index)throws Exception{
    int hasil = array[index];
    return hasil;
  }
  private static int ambilDataArray(int[] array, int index){
    int hasil = 0;
    try{
      hasil = array[index];
    }catch (Exception e){
      System.out.println(e);
    }finally {
      System.out.println("finally tetap di jalankan!");
    }
    return hasil;
  }
}
