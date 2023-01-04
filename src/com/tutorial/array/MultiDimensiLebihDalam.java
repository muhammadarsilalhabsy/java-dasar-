package com.tutorial.array;

import java.util.Arrays;

public class MultiDimensiLebihDalam {
  public static void main(String[] args) {
    int[] data = {1,2,3,4};
    System.out.println(data);

    char[] charArray1 = {'a','b','c'};
    char[] charArray2 = {'d','e','f'};

    char[][] char2D = {
            charArray1,
            charArray2
    };

//    int[][] gabungan = {
//            charArray1, // ERROR
//            data
//    };

    // beda char[] perilakunya dengan int[] harus di ambil addressnya
    System.out.println("\nLangsung");
    System.out.println(charArray1);
    System.out.println(charArray2);

    // mengambil hash codenya
    System.out.println("\nMengambil hascode");
    System.out.println(System.identityHashCode(charArray1));
    System.out.println(System.identityHashCode(charArray2));


    // mengambil integernya
    System.out.println("\nMengambil hex string");
    System.out.println(Integer.toHexString(System.identityHashCode(charArray1)));
    System.out.println(Integer.toHexString(System.identityHashCode(charArray2)));

    // mengambil address dari char2d
    System.out.println("\nMengambil addres char2D");
    System.out.println(Arrays.toString(char2D));

  }
}
