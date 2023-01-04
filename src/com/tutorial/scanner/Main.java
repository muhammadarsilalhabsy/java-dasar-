package com.tutorial.scanner;

import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Siapa Nama Kamu? ");
    String name = input.next();

    System.out.print("Umur? ");
    int age = input.nextInt();

    System.out.print("Kamu Sekolah Atau Kuliah? ");

    String edu = input.next();
    String position = null;

    if (edu.equalsIgnoreCase("sekolah")) {
      System.out.print("SD, SMP, SMA, SMK?");
      position = input.next();
    }else if (edu.equalsIgnoreCase("kuliah")) {
      position = "Universitas";
    }

    System.out.print("Nama instansi? ");
    String eduName = input.next();

    printBio(name, age, position, eduName);
  }

  private static void printBio(String name, int age, String education, String location) {
    System.out.println("Nama : " + name);
    System.out.println("Umur : " + age);
    System.out.printf("%s : %s", education, location);
  }


}
