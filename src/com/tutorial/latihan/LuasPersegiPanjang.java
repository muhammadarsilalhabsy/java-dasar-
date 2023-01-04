package com.tutorial.latihan;


import java.util.Scanner;

public class LuasPersegiPanjang {
  public static void main(String[] args) {
    int panjang, lebar, luas, tinggi;
    Scanner input = new Scanner(System.in);

    System.out.println("Menghitung luas");
    // rumus luas = panjang x lebar;
    System.out.print("Panjang : ");
    panjang = input.nextInt();

    System.out.print("Lebar : ");
    lebar = input.nextInt();

    luas = panjang * lebar;
    if(lebar < panjang){
      System.out.println("Luas = " + luas);

      System.out.println("\nMenghitung volume");
      // rumus volume = luas * tinggi;
      System.out.print("Tinggi: ");
      tinggi = input.nextInt();
      tinggi = luas * tinggi;
      System.out.println("volume : " + tinggi);

    }else{
      System.err.println("Lebar tidak boleh lebih besar dari pada panjang Brader!");
      System.err.println("Ente tidak bisa menghitung volume jika 'luas' tidak ditemukan!");
      System.err.println("Nda terbalik zy kah ko input itu?!");
    }

  }
}
