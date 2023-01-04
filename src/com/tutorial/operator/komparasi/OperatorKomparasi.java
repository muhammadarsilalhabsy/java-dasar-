package com.tutorial.operator.komparasi;

public class OperatorKomparasi {
  public static void main(String[] args) {
    System.out.println("==, !=, <, >, <=, >=\n");

    int a,b,c;
    boolean result;

    a = 10;
    b = 10;
    c = 5;

    // -------------- == || !=
    System.out.println("Persamaan || Equals");
    result = (a == b);
    System.out.printf("%d == %d --> %s\n",a,b,result);
    result = (c == b);
    System.out.printf("%d == %d --> %s\n",b,c,result);

    System.out.println("\nPertidak samaan || Not Equals");
    result = (a != b);
    System.out.printf("%d != %d --> %s\n",a,b,result);
    result = (b != c);
    System.out.printf("%d != %d --> %s\n",b,c,result);

    // -------------- < || >
    System.out.println("\nLebih Dari || greater then");
    result = (a < b);
    System.out.printf("%d < %d --> %s\n",a,b,result);
    result = (b < c);
    System.out.printf("%d < %d --> %s\n",b,c,result);

    System.out.println("\nKurang dari || less then");
    result = (a > b);
    System.out.printf("%d > %d --> %s\n",a,b,result);
    result = (b > c);
    System.out.printf("%d > %d --> %s\n",b,c,result);

    // -------------- <= || >=
    System.out.println("\nLebih dari sama dengan || greater then equals");
    result = (a <= b);
    System.out.printf("%d <= %d --> %s\n",a,b,result);
    result = (b <= c);
    System.out.printf("%d <= %d --> %s\n",b,c,result);

    System.out.println("\nKurang dari sama dengan || less then equals");
    result = (a >= b);
    System.out.printf("%d >= %d --> %s\n",a,b,result);
    result = (b >= c);
    System.out.printf("%d >= %d --> %s\n",b,c,result);

  }
}
