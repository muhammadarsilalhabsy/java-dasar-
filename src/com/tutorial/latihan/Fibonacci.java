package com.tutorial.latihan;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


    System.out.print("Insert fibonacci ke: ");
    int n = input.nextInt();
    caraWhile(n);
//    caraForLoop(n);


  }

  private static void caraForLoop(int n) {
    int fn, fn_1, fn_2;

    fn = 1;
    fn_1 = 1;
    fn_2 = 0;

    for (int i = 1; i <= n; i++) {
      System.out.printf("nilai ke %d adalah %d\n", i, fn);
      fn = fn_1 + fn_2;
      fn_2 = fn_1;
      fn_1 = fn;
    }
  }

  private static void caraWhile(int n) {
    int fn, fn_1, fn_2, awal;

    awal = 1;
    fn_1 = 1;
    fn_2 = 0;
    fn = 1;

    while (awal <= n) {
      System.out.printf("nilai ke %d adalah %d\n", awal, fn);
      fn = fn_1 + fn_2;
      fn_2 = fn_1;
      fn_1 = fn;
      awal++;
    }
  }
}

