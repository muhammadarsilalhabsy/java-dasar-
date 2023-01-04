package com.tutorial.konversi;

public class DataType {
  public static void main(String[] args) {

    // konversi data type

    int intValue = 450;

    long longValue = intValue; // bisa langsung

    byte byteValue = (byte) longValue; // harus di casting

    System.out.println(byteValue);

    // without casting
    System.out.println("Without Casting");
    int o = 10;
    int p = 4;
    int q = o /p;
    System.out.printf("%d / %d = %d\n",o,p,q);

    System.out.println("With Casting");
    // casting
    float a = 10;
    int b = 4;
    float c = a / b;
    System.out.printf("%f / %d = %f\n",a,b,c);

    System.out.println("Beast Way to Casting");
    // cara terbaik
    int x = 10;
    int y = 4;
    float z = (float) x / y;
    System.out.printf("%d / %d = %f\n",x,y,z);

  }
}
