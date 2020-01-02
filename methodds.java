class MinNumber{
  public static void main(String[] args) {
    int a = 11; int b=336;
    int c = minFunction(a,b);
    System.out.println("The Minimum Value is :- " +c);
  }
  public static int minFunction(int n1,int n2){
    int min;
    if(n1>n2)
    return n2;
    else
    return n1;

  }
}
