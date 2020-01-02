import java.util.Scanner;
class Number {
  public static void main(String[] args) {
    Scanner jk= new Scanner (System.in);
    System.out.println("Enter your Alphabet : ");

    char n;
    n=jk.next().charAt(3);
    System.out.println("The Alphabet you've added is  " + n );
  }
}
