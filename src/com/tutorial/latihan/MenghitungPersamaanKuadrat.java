package com.tutorial.latihan;

import java.util.Scanner;


public class MenghitungPersamaanKuadrat {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int m, x, c;

    System.out.print("Nilai x = ");
    x = input.nextInt();
    System.out.print("Gradient m =");
    m = input.nextInt();
    System.out.print("Bias c = ");
    c = input.nextInt();

    int y = (m * x * x) + c;
    System.out.println("\nY = " + y);

  }
}
