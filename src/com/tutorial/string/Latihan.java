package com.tutorial.string;

import java.util.Scanner;

public class Latihan {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("tebakan anda:");
    String tebakan = input.next();

    String answer = "sayur";

    System.out.println(tebakan == answer);
    System.out.println(tebakan.equals(answer));
    System.out.println(tebakan.equalsIgnoreCase(answer));

    // akan selalu false, karena tebakan adalah object, sedangkan
    // answer adalah string literal.
    // string object disimpan di memory heap, sedangkan
    // string literal disimpan di memory string pool.
    // solusi untuk mengkompernya bisa menggunakan equals method
    // atau menggunakan equalsIgnoreCase

    // if(tebakan == answer){
    if(tebakan.equals(answer)){
      System.out.println("Tebakan Benar");
    }else {
      System.out.println("Tebakan Salah");
    }



  }
}
