package com.tutorial.function;

public class RecursiveDeretAngka {
  public static void main(String[] args) {
    deretAngka(10);
  }

  private static void deretAngka(int value){
    if(value == 1){
      System.out.println(value);
    }else {
      deretAngka(value + 1);
      System.out.println(value);
    }
  }
}
