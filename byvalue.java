import java.lang.*;
import java.io.*;
class PassByValue{
  public static void main(String[] args) {
    int i=4,j=25,k;
    k = add(i,j);
  }
  public static int add(int a, int b){
    return a+b;
  }
}
