package com.tutorial.string;

public class Operator {
  public static void main(String[] args) {

    String kalimat = "Muhammad Arsil Alhabsy";

    // substring
    System.out.println("\nSubstring method");
    String arsil = kalimat.substring(9,14);
    System.out.println(arsil);


    System.out.println("\nConcatenate Method");
    String tamvan = "Tamvan";
    String concate = arsil.concat(" " + tamvan);
    System.out.println(concate);


    System.out.println("\nUppercase Method");
    String upper = kalimat.toUpperCase();
    System.out.println(upper);


    System.out.println("\nLowercase Method");
    String lower = kalimat.toLowerCase();
    System.out.println(lower);


    System.out.println("\nReplace Method");
    String replace = kalimat.replace("a","*");
    System.out.println(replace);


    System.out.println("\nEquals Method");
    String tebakan = "sayur";
    String answer = new String("sAyUr");

    System.out.println(tebakan == answer); // akan selalu false
    System.out.println(tebakan.equals(answer)); // sayur
    System.out.println(tebakan.equalsIgnoreCase(answer)); // sayur, Sayur, SaYur, ect.


    System.out.println("\nCompareTo Method");
    String motor1 = "Yamaha";
    String motor2 = "Honda";
    String sama1 = "sam1";
    String sama2 = "sama";

    System.out.println(motor1.compareTo(motor2)); // yxwvutsrqponmlkjih (17)
    System.out.println(motor2.compareTo(motor1)); // hijklmnopqrstuvwxy (-17)

    System.out.println(sama1.compareTo(sama2));
    System.out.println(sama2.compareTo(sama1));










  }
}
