package com.tutorial.errorhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class MenangkapDiClass {
  public static void main(String[] args) throws IOException {
    FileInputStream fileInputStream = new FileInputStream("filee.txt");
// kalau filenya tidak ada, akan error seperti biasa

    System.out.println((char) fileInputStream.read());
    System.out.println("Selesai");
  }
}
