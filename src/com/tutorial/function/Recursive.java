package com.tutorial.function;

public class Recursive {
  public static void main(String[] args) {
    System.out.println("star");
//    count(5);

    int result = jumlahNilai(5);
    System.out.println("Result = " + result);


    int factorialResult = factorial(5);
    System.out.println("Result Factorial = " + factorialResult); // 120

    // 5 x 4 x 3 x 2 x 1 = 120

    System.out.println("finish");
  }

  private static int jumlahNilai(int value) {
    if (value == 0) {
      return value;
    }
    return value + jumlahNilai(value - 1);
  }

  private static void count(int value) {
    if (value == 0) {
      return;
    }
    value--;
    System.out.println("nilai = " + value);
    count(value);
  }

  private static int factorial(int value) {
    if (value == 1) {
      return value;
    }
    return value * factorial(value - 1);
  }
}
