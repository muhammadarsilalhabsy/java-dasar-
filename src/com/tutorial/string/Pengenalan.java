package com.tutorial.string;
import java.util.Arrays;

public class Pengenalan {
  public static void main(String[] args) {

    String kataString = "hallo";
    char[] kataChar = {'h','a','l','l','o'};

    System.out.println(kataString);
    System.out.println(Arrays.toString(kataChar));
    System.out.println(kataChar);

    // mengakses perkomponen
    System.out.println("\nKomponen pertama");
    System.out.printf("%s => %s\n",Arrays.toString(kataChar), kataChar[0]);
    System.out.printf("%s => %s\n",kataString,kataString.charAt(0));

    // mengubah komponen string
    // tidak bisa mengubah komponen string secara langsung, karena string di java immutable
    // kataString.charAt(0) = 'c'; <=== ERROR
    // kataString[0] = 'c'; <==== ERROR

    // address sebelumya dibubah
    printAddress(kataString, "kataString");

    // kita bisa mengubahnya secara tidak lansung
    kataString = "c" + kataString.substring(1, kataString.length() - 1);

    // address setelah di ubah
    printAddress(kataString, "kataString");

    // String memory (string pool, adalah slot memory untuk string)
    System.out.println("/Memory pada String");
    String test1 = "test";
    String test2 = "test";
    String test3 = "testing";
    String test4 = "call";

    printAddress(test1,"test1");
    printAddress(test2, "test2");
    printAddress(test3, "test3");

    test3 = test3.substring(0,4);
    printAddress(test3, "test3"); // membuat pool baru

    System.out.println(test3 == test2); // false, karena beda lokasi penyimpanan memory

    printAddress(test4, "test4"); // beda dengan kataString yang sudah di substring menjadi callo, line 28

    kataString = "call";
    printAddress(kataString, "kataString");

    System.out.println(test4 == kataString); // true, karena memiliki lokasi penyimpanan memory yang sama

    // 1. String di java itu immutable
    // 2. String yang berada di mwmory string pool (String literal) itu akan reusable
    // penggunaan memory lebih efisien
    // 3. String yang dibuah menggunaan method baru, addresnya akan disimpan di memory lain
    // bukan di string pool

    String a = new String("call"); // akan disimpan di memory heap (sama seperti array)
    printAddress(a,"a");



  }
  private static void printAddress(String data, String des){
    String getAddress = Integer.toHexString(System.identityHashCode(data));
    System.out.println(des + " = " + data + " => " + getAddress );
  }
}
