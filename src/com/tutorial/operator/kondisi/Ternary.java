package com.tutorial.operator.kondisi;
import java.util.Scanner;

public class Ternary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Insert a number: ");
    int userInput = input.nextInt();

    // apakah userInput sama dengan data?
    // kalau iya, kuadrat, kalau tidak di bagi
    int value = (userInput == 10) ? userInput*userInput : userInput/2;
    System.out.println("Hasil Ternary: " + value);

    int data = 10;

    if(data == 10){
      data = data*data;
    }else{
      data = data/2;
    }

    System.out.println("Hasil if else: " + data);


  }
}
