class Math{
  private int no;   //instance varible
  public Math()    //constructor
  {
    no=5;
  }
  public Math(int no)
  {
    this.no=no;
  }
  public int power(int a,int b)
  {
    int prod=1;
    for(int i=0;i<b;i++)
      prod*=a;
      return prod;
  }
  public void set(int x)
  {
    no=x;
  }
  public int get()
  {
    return no;
  }
}
class Main{
  public static void main(String[] args) {
    Math x=new Math(10);
    Math y=new Math();
    y.set(567);
    System.out.print(x.power(2,10) +" "+ y.get());
  }
}
