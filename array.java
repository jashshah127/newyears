import java.util.Scanner;

class Arydemo{
  public static void main(String[] args) {
int[] b = {1,4,32,6,4};

    Array a1=new Array();
    Array a2=new Array(10);
    Array a3=new Array(b);
    System.out.println("Enter elements of a1(5): ");
    a1.read();
    System.out.println("Enter elements of a2(10): ");
    a2.read();
    System.out.println("Entered elements of a1: ");
    a1.disp();
    System.out.println("Entered elements of a2: ");
    a2.disp();
    System.out.println("Entered elements of a3: ");
    a3.disp();
  }
}
class Array{
  private int a[];
  public Array()
  {
    a=new int[5];
  }
  public Array(int n)
  {
    a=new int[n];
  }
  public Array(int x[])
  {
    a=x;
  }
  public void read()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter elements: ");
    for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
    }
  }
  public void disp(){
    for (int i=0;i<a.length;i++) {
      System.out.println(a[i]);
    }
  }
}
