package com.tutorial.controlflow;

public class ControlFlow {
  public static void main(String[] args) {

    int index = 0;
    while(true){

      index++;
      if(index == 10){
        break; // memaksa keluar
      } else if (index == 5) {
        System.out.println("Di Skip");
        continue; // akan locat ke awal
      } else if(index == 7){
        return; // pasangan dengan method
      }
      System.out.printf("looping ke - %d\n", index);
    }
  }
}
