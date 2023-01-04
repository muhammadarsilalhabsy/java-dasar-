package com.tutorial.latihan;

import java.util.Scanner;

public class TebakanOperatorLogika {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int guess, answer;

    answer = 7;
    boolean status = true;

    while (status) {

      System.out.print("Masukan tebakan anda: ");
      guess = input.nextInt();

      if (guess == answer) {
        status = false;
      } else if (guess > 5 && guess <= 8) {
        System.out.println("Pretty close!");
      } else if (guess > 4 && guess <= 9) {
        System.out.println("your guessing is near to the answer!");
      } else {
        System.out.println("The answer is between 1-10");
      }
    }

    System.out.println("Congratulation your answer is right");
  }

}
