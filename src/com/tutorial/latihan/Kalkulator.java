package com.tutorial.latihan;

import java.util.Scanner;


public class Kalkulator {
  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    int a, b, intResult;
    char op;
    String isNext;
    float floatResult;
    boolean status = true;

    System.out.println("====Aturan====");
    System.out.println("input : any number");
    System.out.println("operator : +,-,x,/,%");
    System.out.println("y for continue, n for exit");

    while (status) {
      System.out.print("Ready (y/n) ? ");
      isNext = userInput.nextLine();

      if (isNext.equalsIgnoreCase("y")) {

        System.out.println("\n===Kalkulator===");
        System.out.print("input: ");
        a = userInput.nextInt();

        System.out.print("operator: ");
        op = userInput.next().charAt(0);

        System.out.print("input: ");
        b = userInput.nextInt();

        if (op == '+') {
          intResult = a + b;
          System.out.printf("%d + %d = %d\n", a, b, intResult);
        } else if (op == '-') {
          intResult = a - b;
          System.out.printf("%d - %d = %d\n", a, b, intResult);
        } else if (op == 'x') {
          intResult = a * b;
          System.out.printf("%d x %d = %d\n", a, b, intResult);
        } else if (op == '/') {
          if (b == 0) {
            System.out.println("cannot divided by zero blok!");
          } else {
            floatResult = (float) a / (float) b;
            System.out.printf("%d / %d = %f\n", a, b, floatResult);
          }
        } else if (op == '%') {
          intResult = a % b;
          System.out.printf("%d %% %d = %d\n", a, b, intResult);
        } else {
          System.out.printf("[>> %s <<] is not a arithmetic operator!\n", op);
        }

        System.out.println("===============\n");
      } else if (isNext.equalsIgnoreCase("n")) {
        status = false;

      } else {
        System.out.println("Just (y/n) blok!");
      }
    }
    System.out.println("Thank you!");

  }
}
