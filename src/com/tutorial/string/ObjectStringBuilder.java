package com.tutorial.string;

public class ObjectStringBuilder {
  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder("coba");

//    System.out.println(builder);
//    System.out.println(builder.length()); // 4
//    System.out.println(builder.capacity()); // 20 (default capacity stringBuilder adalah 16)

    printData(builder);

    System.out.println("\nAppend Method=====");
    builder.append(" coba saja dulu toh");

    printData(builder);

    System.out.println("\nInsert Method=====");
    builder.insert(15,"ini ");

    printData(builder);

    System.out.println("\nDelete Method=====");
    builder.delete(5,10);

    printData(builder);

    System.out.println("\nsetCharAt Method=====");
    builder.setCharAt(7,'T');

    printData(builder);

    System.out.println("\nsetCharAt Method=====");
    builder.replace(19,builder.length(),"yah");

    printData(builder);

    // and many more
    // https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html

    System.out.println("\nconvert to String");
    String kalimat = builder.toString();
    System.out.println(kalimat);
    String addressString = Integer.toHexString(System.identityHashCode(kalimat));
    String addressStringBuilder = Integer.toHexString(System.identityHashCode(builder));
    System.out.println(addressString);
    System.out.println(addressString == addressStringBuilder);

  }

  private static void printData(StringBuilder builder){
    System.out.println(builder);
    System.out.println(builder.length()); // 4
    System.out.println(builder.capacity()); // 20 (default capacity stringBuilder adalah 16)
    int address = System.identityHashCode(builder);
    System.out.println("address = " + Integer.toHexString(address));
  }
}
