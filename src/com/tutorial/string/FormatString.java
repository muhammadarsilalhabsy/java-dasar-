package com.tutorial.string;

public class FormatString {
  public static void main(String[] args) {

    // conversion : s=String, f=float, d=integer, b=boolean, c=char
    // struktur format: %[argumentIndex$][flags][width][.precision]conversion


    String name = "Arsil";
    String friends = "Nova";
    int arsilAge = 21;
    float novaAge = 21.6f;

    System.out.println("argumentIndex$");
    System.out.printf("%s dan %s\n", name, name); // without argumentIndex$
    System.out.printf("%1$s dan %1$s\n", name); // with argumentIndex$
    System.out.printf("%1$s dan %2$s lalu %1$s\n", name, friends);

    System.out.println("\n[flags]");
    float countAge =  arsilAge + novaAge;
    System.out.printf("%d - %f = %+f\n",arsilAge, novaAge, countAge);

    // struktur format: %[argumentIndex$][flags][width][.precision]conversion
    System.out.println("\n[width]");
    System.out.printf("%d\n",arsilAge);
    System.out.printf("%5d\n",arsilAge); // rata kanan (dengan space kosong 3)
    System.out.printf("%-5d\n",arsilAge); // rata kiri (dengan space kosong 3)
    System.out.printf("%+5d\n",arsilAge); // rata kanan (dengan space kosong 3) dan ada + di depan angkanya
    System.out.printf("%+-5d\n",arsilAge); // flags bisa digabungkan

    System.out.println("leading");
    System.out.printf("%10d\n",arsilAge);
    System.out.printf("% 10d\n",arsilAge); // sama

    System.out.printf("%010d\n",arsilAge); // leading






  }
}
