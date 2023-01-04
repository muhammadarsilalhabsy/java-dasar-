package com.tutorial.bitwise;

public class BitwiseOperator {
  public static void main(String[] args) {
    // Operator bitwise diguanakan untuk melakukan operasi pada bit
    // 1 byte = 8 bit
    // 2 byte = 16 bit

    byte a, b, c, d;
    String aBits, bBits, cBits, dBits;

    a = 10;
    aBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
    System.out.printf("%s = %d\n", aBits, a);

    // operator sift left
    System.out.println("\n==== Shift Left (<<)");
    b = (byte) (a << 3); // akan mengeser 3 posisi ke kiri

    bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
    System.out.printf("%s = %d\n", bBits, b);

    // operator sift right
    System.out.println("\n==== Shift Right (>>)");
    c = (byte) (b >> 2); // akan mengeser 3 posisi ke kiri

    cBits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
    System.out.printf("%s = %d\n", cBits, c); // 20

    // operator Bitwise OR
    System.out.println("\n==== Bitwise OR (|)");
    b = 14;
    c = 20;

    bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
    System.out.printf("%s = %d\n", bBits, b);
    cBits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
    System.out.printf("%s = %d\n", cBits, c);

    System.out.println("------------OR");
    // bitwise or
    d = (byte) (b | c);

    dBits = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
    System.out.printf("%s = %d\n", dBits, d);

    // operator Bitwise AND
    System.out.println("\n==== Bitwise And (&)");
    b = 14;
    c = 20;

    bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
    System.out.printf("%s = %d\n", bBits, b);
    cBits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
    System.out.printf("%s = %d\n", cBits, c);

    System.out.println("------------AND");
    // bitwise or
    d = (byte) (b & c);

    dBits = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
    System.out.printf("%s = %d\n", dBits, d);

    // operator Bitwise XOR
    System.out.println("\n==== Bitwise Xor (&)");
    b = 14;
    c = 20;

    bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
    System.out.printf("%s = %d\n", bBits, b);
    cBits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
    System.out.printf("%s = %d\n", cBits, c);

    System.out.println("------------XOR");
    // bitwise or
    d = (byte) (b ^ c);

    dBits = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
    System.out.printf("%s = %d\n", dBits, d);

    // operator Bitwise NOT
    System.out.println("\n==== Bitwise NOT (~)");
    b = 14;
    c = (byte) (~b);

    bBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
    System.out.printf("%s = %d\n", bBits, b);
    System.out.println("------------NOT");
    cBits = String.format("%8s", Integer.toBinaryString(c)).substring(24);
    System.out.printf("%s = %d\n", cBits, c);


  }
  // 00001110
  // 00010100
  // 00011010

}
