package com.tutorial.iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class Pengenalan {
  public static void main(String[] args) {

    System.out.println("\nProgram selesai");
    try{
      FileInputStream fileInput = new FileInputStream("test input.txt");
      System.out.println((char)fileInput.read());
      System.out.println((char)fileInput.read());
      System.out.println((char)fileInput.read());
      System.out.println((char)fileInput.read());

    }catch (IOException e){
      System.err.println(e);
    }
    System.out.println("\nProgram selesai");
  }
}
