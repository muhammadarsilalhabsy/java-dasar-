package com.tutorial.latihan;

import java.util.Scanner;


public class GambarPanjangLebarLuasPersegi {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Menghitung panjang lebar dan luas");

    System.out.print("Masukan panjang: ");
    int length = input.nextInt();
    System.out.print("Masukan lebar: ");
    int width = input.nextInt();

    Draw(width, length);

  }

  private static void Draw(int width, int length) {
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < length; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    luas(width, length);
    System.out.printf("Keliling = %d\n", keliling(width, length));
  }

  private static void luas(int width, int length) {
    int result = width * length;
    System.out.printf("Luas = %d\n", result);
  }

  private static int keliling(int width, int length) {
    return (width + length) * 2;
  }
}
