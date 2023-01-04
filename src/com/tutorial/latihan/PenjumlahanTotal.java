package com.tutorial.latihan;
import java.util.Scanner;


public class PenjumlahanTotal {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Start");


//    caraForLoop();
//    caraWhile(input);
//    caraDoWhile(input);
    normal(input);

    System.out.println("\nFinish");

  }
  private static void caraForLoop(){
    int total = 0;
    System.out.println("pertama 0");
    for (int i = 1; i <= 10; i++){
      total = total + i;
      System.out.printf("ditambah %d menjadi %d\n",i,total);
    }
    System.out.println("Result = " + total );

  }
  private static void caraWhile(Scanner input){
    System.out.print("Nilai awal: ");
    int awal = input.nextInt();
    System.out.print("Nilai akhir: ");
    int akhir = input.nextInt();
    int total = 0;

    System.out.println("pertama 0");
    while(awal <= akhir){
      total = total + awal;
      System.out.printf("ditambah %d menjadi %d\n",awal,total);
      awal++;
    }
    System.out.println("Result = " + total);
  }
  private static void caraDoWhile(Scanner input){
    System.out.print("Nilai awal: ");
    int awal = input.nextInt();
    System.out.print("Nilai akhir: ");
    int akhir = input.nextInt();
    int total = 0;

    System.out.println("pertama 0");
    do{
      total = total + awal;
      System.out.printf("ditambah %d menjadi %d\n",awal,total);
      awal++;
    }while(awal <= akhir);
  }
  private static void normal(Scanner input){
    System.out.print("Nilai awal: ");
    int awal = input.nextInt();
    System.out.print("Nilai akhir: ");
    int akhir = input.nextInt();
    int total = 0;

    System.out.print("0 ");
    do{
      total = total + awal;
      if (awal == akhir){
        System.out.print("= " + total);
      }else{
      System.out.printf("+ %d = %d ",awal,total);

      }
      awal++;
    }while(awal <= akhir);

  }
}
