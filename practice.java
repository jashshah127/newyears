import java.util.Scanner;
class X{
public static void main (String hdhd[]){
  int[] b = {3,2,1};

  Array a1= new Array();
  Array a2= new Array(10);
  Array a3= new Array(b);
System.out.println("Enter elements of a1(4) : ");
a1.read();
System.out.println("Enter elements of a2(10) : ");
a2.read();
System.out.println("The entered elements of a1 are : ");
a1.disp();
System.out.println("The entered elements of a2 are : ");
a2.disp();
System.out.println("Enter elements of a3 : ");
a3.disp();
}
}
class Array{
  private int a[];
  public Array()
  {
    a=new int[4];
  }
  public Array(int n)
  {
    a= new int[n];
  }
  public Array(int x[])
  {
    a=x;
  }
  public void read()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter all elements : ");
    for(int i=0;i<a.length;i++){
      a[i]= sc.nextInt();
    }
  }
  public void disp(){
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}
