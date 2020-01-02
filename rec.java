import java.io.*;
import java.lang.String;

class Recurs{
  static void p(){
    System.out.println("Hello");
    p();
  }
  public static void main(String args[]){
    p();
  }
}
