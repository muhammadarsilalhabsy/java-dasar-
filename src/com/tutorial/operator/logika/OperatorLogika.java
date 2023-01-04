package com.tutorial.operator.logika;

public class OperatorLogika {
  public static void main(String[] args) {
    // and (&&) or (||) xor(^)
    boolean a,b,c;

    // or adalah + penjumlahan
    System.out.println("OR (||)");
    a = false;
    b = false;
    c = (a || b);
    System.out.printf("%s || %s --> %s\n",a,b,c);

    a = true;
    b = false;
    c = (a || b);
    System.out.printf("%s || %s --> %s\n",a,b,c);

    a = false;
    b = true;
    c = (a || b);
    System.out.printf("%s || %s --> %s\n",a,b,c);

    a = true;
    b = true;
    c = (a || b);
    System.out.printf("%s || %s --> %s\n",a,b,c);


    // and adalah * perkalian
    System.out.println("\nAND (&&)");
    a = false;
    b = false;
    c = (a && b);
    System.out.printf("%s && %s --> %s\n",a,b,c);

    a = true;
    b = false;
    c = (a && b);
    System.out.printf("%s && %s --> %s\n",a,b,c);

    a = false;
    b = true;
    c = (a && b);
    System.out.printf("%s && %s --> %s\n",a,b,c);

    a = true;
    b = true;
    c = (a && b);
    System.out.printf("%s && %s --> %s\n",a,b,c);


    // xor atau exclusive or akan true apabila nilainya sama
    System.out.println("\nXOR (^)");
    a = false;
    b = false;
    c = (a ^ b);
    System.out.printf("%s ^ %s --> %s\n",a,b,c);

    a = true;
    b = false;
    c = (a ^ b);
    System.out.printf("%s ^ %s --> %s\n",a,b,c);

    a = false;
    b = true;
    c = (a ^ b);
    System.out.printf("%s ^ %s --> %s\n",a,b,c);

    a = true;
    b = true;
    c = (a ^ b);
    System.out.printf("%s ^ %s --> %s\n",a,b,c);

    // negasi (!_)
    System.out.println("\nNEGASI (!)");
    a = true;
    b = !a;
    System.out.printf("!%s = %s\n",a,b);

    a = false;
    b = !a;
    System.out.printf("!%s = %s",a,b);

  }
}
