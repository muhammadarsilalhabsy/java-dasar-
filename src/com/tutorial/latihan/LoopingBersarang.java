package com.tutorial.latihan;

public class LoopingBersarang {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++){
      System.out.printf("looping i ke = %d --> ",i);
      for (int j = 0; j < 5; j++){
        System.out.print("* ");
      }
      System.out.print("\n");
    }

    // kubus
    System.out.println("\nKubus");
    kubus();

    // segitiga |_\
    System.out.println("\nSegitiga kiri bawah");
    segitigaRataKiriBawah();

    // segitiga oposite |_\
    System.out.println("\nOposite Segitiga kiri bawah");
    opositeSegitigaRataKiriBawah();

    // segitiga |/
    System.out.println("\nSegitiga kanan atas" );
    segitigaRataKananAtas();

    // segitiga |/
    System.out.println("\nOposite Segitiga kanan atas" );
    opositeSegitigaKananAtas();


    // segitiga gabungan
    System.out.println("\nSegitiga gabungan" );
    gabungan();



  }

  private static void kubus(){
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 5; j++){
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
  private static void segitigaRataKiriBawah(){
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 5; j++){
        System.out.print("* ");
        if(i == j){
          break;
        }
      }
      System.out.print("\n");
    }
  }
  private static void opositeSegitigaRataKiriBawah(){
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 5; j++){
        if((i > j)) {
          System.out.print("  ");
          continue;
        }
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
  private static void segitigaRataKananAtas(){
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 5; j++){
        System.out.print("* ");
        if((i + j) == 4){
          break;
        }
      }
      System.out.print("\n");
    }
  }
  private static void opositeSegitigaKananAtas(){
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 5; j++){
        if ((i+j) < 4){
          System.out.print("  ");
          continue;
        }
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
  private static void gabungan(){
    for (int i = 0; i < 9; i++){
      for (int j = 0; j < 9; j++){
        System.out.print("* ");
        if(i == j){
          break;
        } else if ((i + j) == 8) {
          break;
        }
      }
      System.out.print("\n");
    }
  }


  private static void mirings(){
    for (int i = 0; i < 9; i++){
      for (int j = 0; j < 9; j++){
        if ( (i+j) > 12){
          break;
        }
        else if ( (j >= 4) && (j-i) > 4){

          break;
        }
        else if ( (j <= 4) && (i+j) < 4){
          System.out.print("  ");
          continue;
        }
        else if ( (i >= 4) && (i-j) > 4){
          System.out.print("  ");
          continue;
        }
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }

}
