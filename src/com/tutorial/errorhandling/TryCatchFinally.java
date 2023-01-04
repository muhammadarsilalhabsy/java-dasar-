package com.tutorial.errorhandling;

import javax.imageio.stream.FileImageInputStream;
import java.awt.image.ImagingOpException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchFinally {
  public static void main(String[] args) {

    // try catch finally
    Scanner input = new Scanner(System.in);
    FileInputStream fileInputStream = null;

    System.out.print("Masukan Array ke :");
    int value = input.nextInt();

    int[] array = {7, 3, 8, 5, 1};


//    // menangkap error array
//    try {
//      System.out.printf("Array ke %d, nilainya %d\n", value, array[value]);
//    } catch (Exception e) {
//      System.err.println(e);
//    }
//

//    // menangkap error yang kemungkinan terjadi
//    try {
//      fileInputStream = new FileInputStream("file.txt");
//    } catch (IOException e) {
//      System.err.println(e);
//    }

    // mengabungkan 2 kemungkinan error
//    try{
//      System.out.printf("Array ke %d, nilainya %d\n", value, array[value]);
//      fileInputStream = new FileInputStream("file.txt");
//    }catch (ArrayIndexOutOfBoundsException e){
//      System.err.println(e);
//    } catch (FileNotFoundException e){
//      System.err.println(e);
//    }

    // menangkap error dengan menjalankan finally
    try {
      System.out.printf("Array ke %d, nilainya %d\n", value, array[value]);
      fileInputStream = new FileInputStream("file.txt");
    } catch (ArrayIndexOutOfBoundsException |
             FileNotFoundException e) {
      System.err.println(e);
    } finally {
      System.out.println("Jalankan Finally");
    }

    System.out.println("Finish!");
  }
}
