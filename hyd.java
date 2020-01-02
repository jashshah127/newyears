import java.util.Scanner;
class Y{
  public static void main(String args[] ){
    int b[]= {3,2,1};

    Array a1 = new Array();
    Array a2 = new Array(10);
    Array a3 = new Array(b);

    System.out.println("Enter the elements of a1 ");
    a1.read();
    System.out.println("Enter the elements of a2 ");
    a2.read();
    System.out.println("The entered elements of a1 are ");
    a1.disp();
    System.out.println("The entered elements of a2 are ");
    a2.disp();
    System.out.println("The entered elements of a3 are ");
    a3.disp();
  }
}

class Array{
  private int a[];
  public Array()
  {
    a= new int[7];
  }
  public Array(int n)
  {
    a= new int [n];
  }
  public Array(int x)
  {
    a=x;
  }
  public void read(){
  Scanner gh = new Scanner(System.in);
  for(int i=0; i<a.length; i++){
    a[i]= gh.nextInt();
  }
}
public void display(){
  for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
  }
}
}
