//1.	W. P. that reverse a number.
import java.util.Scanner;
class Rev
{
	public static void main(String a[])
	{
		Scanner scanf=new Scanner(System.in);
		System.out.print("Enter The No: ");
		int x=scanf.nextInt();
		int rev=0;
		while(x!=0)
		{
			rev*=10;
			rev+=x%10;
			x/=10;
		}
		System.out.println(rev + " is the reversed No");
	}
}

//3.	W. P. To prints Fibonacci series.
import java.util.Scanner;
class Fibonac
{
	public static void main(String A[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1;
		System.out.print("Enter Number of terms: ");
		int n=sc.nextInt();
		System.out.print(a + ", " + b);
		for(int i=2;i<n;i++)
		{
			int x=a+b;
			System.out.print(", " + x);
			a=b;b=x;
		}

	}
}


//4.	W.P. to merge two arrays in third array .also sort that array in ascending order.
import java.util.Scanner;
class Array
{
	int a[];
	Array()
	{
		a=new int[5];
		for(int i=0;i<a.length;i++)
			a[i]=i;
	}
	Array(int x[])
	{
		a=x;
	}
	void read()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	void disp()
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
	}
	int[] merge(int x[])
	{
		int temp[]=new int[a.length+x.length];
		for(int i=0;i<temp.length;i++)
		{
			if(i<a.length)
				temp[i]=a[i];
			else
				temp[i]=x[i-a.length];
		}
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp.length-i-1;j++)
			{
				if(temp[j]>temp[j+1])
				{
					int temp1=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=temp1;
				}
			}
		}
		return temp;
	}
	void sort()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
class MAIN
{
	public static void main(String A[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Sizes of arrays: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[],b[];
		a=new int[m];
		b=new int[n];
		System.out.println("Enter array 1:");
		for(int i=0;i<m;i++)
				a[i]=sc.nextInt();
		System.out.println("Enter array 2:");
		for(int i=0;i<n;i++)
				b[i]=sc.nextInt();
		Array A_ob=new Array(a);
		Array res=new Array(A_ob.merge(b));
		System.out.println("After Merge ang Sort:");
		res.disp();
	}
}




javalab2.java

Type
Java
Size
359 bytes
Storage used
359 bytes
Location
Java_lab
Owner
me
Modified
Jun 26, 2018 by me
Opened
8:26 PM by me
Created
Jun 26, 2018 with Google Drive Web
Add a description
Viewers can download
import java.util.*;
class Matrix
{
	int a[][];
	int row,col;
	Matrix()
	{
		a=new int[3][3];
		row=col=3;
	}
	Matrix(int r,int c)
	{
		a=new int[r][c];
		row=r;col=c;
	}
	Matrix(int x[][])
	{
		a=x;
		row=x.length;
		col=x[0].length;
	}
	Matrix add(Matrix M)
	{
		if(this.row!=M.row || this.col!=M.col)
		{
			System.out.print("Can't Add Two matrix as Dimensions are not equal !!!");
			return this;
		}
		Matrix t = new Matrix(row,col);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				t.a[i][j]=this.a[i][j]+M.a[i][j];
			}
		}
		return t;
	}
	Matrix mul(Matrix M)
	{
		if(this.col!=M.row)
		{
			System.out.print("Matrix can not be multiplied !!!");
			return this;
		}
		Matrix t = new Matrix(this.row,M.col);
		for(int i=0;i<this.row;i++)				//I is row of A
		{
			for(int j=0;j<M.col;j++)			//J is col of B
			{
				for(int k=0;k<M.row;k++)		//K is row of B as well as col of A
				{
					t.a[i][j]+=this.a[i][k]*M.a[k][j];
				}
			}
		}
		return t;
	}
	void read()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	void display()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
class MAIN
{
	public static void main(String args[])
	{
		Matrix m1,m2,m3;
		//ADDITION  OF TWO MATRICES

		m1=new Matrix(2,3);
		m2=new Matrix(2,3);
		System.out.println("Enter M1:");
		m1.read();
		System.out.println("Enter M2:");
		m2.read();
		m3=m1.add(m2);
		System.out.println("After addition:");
		m3.display();
		//MULTIPLICATION OF TWO MATRICES
		m1=new Matrix(2,3);
		m2=new Matrix(3,4);
		System.out.println("Enter M1:");
		m1.read();
		System.out.println("Enter M2:");
		m2.read();
		m3=m1.mul(m2);
		System.out.println("After MULTIPLICATION:");
		m3.display();
	}
}


javalab2.java

Type
Java
Size
359 bytes
Storage used
359 bytes
Location
Java_lab
Owner
me
Modified
Jun 26, 2018 by me
Opened
8:26 PM by me
Created
Jun 26, 2018 with Google Drive Web
Add a description
Viewers can download
/*
•	Programs for polymorphism and Inheritance

1.	Create a class OverLoadDemo and also create method test () in it.
	Overload test () in four ways. First version takes no parameter,
	the second takes one integer parameter, and the
	third takes two integer parameters and fourth takes one double parameter.
	Call all methods from main() function.
*/
class OverLoadDemo
{
	void test()
	{
		System.out.println("Test with no parameter called\n");
	}
	void test(int x)
	{
		System.out.println("Test with int parameter("+x+")called\n");
	}
	void test(int x,int y)
	{
		System.out.println("Test with two int parameters("+x+","+y+")called\n");
	}
	void test(double x)
	{
		System.out.println("Test with double parameter("+x+")called");
	}
}
class Polymorf
{
	public static void main(String args[])
	{
		OverLoadDemo ob = new OverLoadDemo();
		ob.test();
		ob.test(345);
		ob.test(30,54);
		ob.test(54.67000);
	}
}

/*
2.	Create class ‘Point3D’.
There are three constructor in a Class ‘Point3D’.
The first form accepts one double argument.
The second form accepts two double arguments.
The third form accepts three double arguments.
These are used to initialize all of the instance variables.
Also prints instance variables.
Demonstrate use of overloaded constructors in main function.
*/
class Point3D
{
	double x,y,z;
	Point3D(double x)
	{
		this.x = x;
		this.y = 0;
		this.z = 0;
	}
	Point3D(double x,double y)
	{
		this.x = x;
		this.y = y;
		this.z = 0;
	}
	Point3D(double x,double y,double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	void disp()
	{
		System.out.println(x +"\t"+ y +"\t"+ z);
	}
}
class Polyconst
{
	public static void main(String args[])
	{
		Point3D p1;
		p1=new Point3D(30);
		p1.disp();
		p1=new Point3D(30,40);
		p1.disp();
		p1=new Point3D(30,40,50);
		p1.disp();
	}
}

/*
2.	Interface named Multiplication has two methods, multiplication and display.
	Class MatrixMultiplication and IntegerNumberMultiplication implements Multiplication.
	Write a program for the above condition. Provide appropriate data for the calculation and show output.
*/
import java.util.*;
public interface Multiplication{
	void multiplication();
	void display();
}
class MatrixMultiplication implements Multiplication{
	int a[][];
	int b[][];
	int rowa,cola;
	int rowb,colb;
	MatrixMultiplication()
	{
		a=new int[3][3];
		rowa=cola=3;
		b=new int[3][3];
		rowb=colb=3;
	}
	MatrixMultiplication(int r1,int c1,int r2,int c2)
	{
		a=new int[r1][c1];
		rowa=r1;cola=c1;
		b=new int[r2][c2];
		rowb=r2;colb=c2;
	}
	public void multiplication()
	{
		//verify the condition
		if(cola!=rowb)
		{
			System.out.print("Matrix can not be multiplied !!!");

		}
		//multiplication
		int[][] t=new int[rowa][colb];
		for(int i=0;i<rowa;i++)				//I is row of A
		{
			for(int j=0;j<colb;j++)			//J is col of B
			{
				for(int k=0;k<rowb;k++)		//K is row of B as well as col of A
				{
					t[i][j]+=a[i][k]*b[k][j];
				}
			}
		}

		//print result
		for(int i=0;i<rowa;i++)
		{
			for(int j=0;j<colb;j++)
			{
				System.out.print(t[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Matrix 1 : ");
		for(int i=0;i<rowa;i++)
		{
			for(int j=0;j<cola;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix 2 : ");
		for(int i=0;i<rowb;i++)
		{
			for(int j=0;j<colb;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	}
	public void display()
	{
		System.out.println("Matrix 1 : ");
		for(int i=0;i<rowa;i++)
		{
			for(int j=0;j<cola;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("Matrix 1 : ");
		for(int i=0;i<rowb;i++)
		{
			for(int j=0;j<colb;j++)
			{
				System.out.print(b[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
class IntegerNumberMultiplication implements Multiplication{
	int no1,no2;
	IntegerNumberMultiplication(int a,int b)
	{
		no1=a;no2=b;
	}
	public void multiplication()
	{
		System.out.println("After multipliying: " + no1*no2);
	}
	public void display()
	{
		System.out.println("Number 1: " + no1 + "\tNumber 2: " + no2);
	}
}
class intrfc2{
	public static void main(String args[])
	{
		//instansiation
		MatrixMultiplication mp1=new MatrixMultiplication(2,3,3,4);
		IntegerNumberMultiplication np1 = new IntegerNumberMultiplication(236,576);
		//multipliying intigers and displaying
		np1.multiplication();
		np1.display();
		//multipliying matrix and displaying
		mp1.read();
		mp1.multiplication();
		mp1.display();
	}
}



/*
2.	Interface named Multiplication has two methods, multiplication and display.
	Class MatrixMultiplication and IntegerNumberMultiplication implements Multiplication.
	Write a program for the above condition. Provide appropriate data for the calculation and show output.
*/
import java.util.*;
public interface Multiplication{
	void multiplication();
	void display();
}
class MatrixMultiplication implements Multiplication{
	int a[][];
	int b[][];
	int rowa,cola;
	int rowb,colb;
	MatrixMultiplication()
	{
		a=new int[3][3];
		rowa=cola=3;
		b=new int[3][3];
		rowb=colb=3;
	}
	MatrixMultiplication(int r1,int c1,int r2,int c2)
	{
		a=new int[r1][c1];
		rowa=r1;cola=c1;
		b=new int[r2][c2];
		rowb=r2;colb=c2;
	}
	public void Multiplication()
	{
		//verify the condition
		if(cola!=rowb)
		{
			System.out.print("Matrix can not be multiplied !!!");

		}
		//multiplication
		int[][] t=new int[rowa][colb];
		for(int i=0;i<rowa;i++)				//I is row of A
		{
			for(int j=0;j<colb;j++)			//J is col of B
			{
				for(int k=0;k<rowb;k++)		//K is row of B as well as col of A
				{
					t[i][j]+=a[i][k]*b[k][j];
				}
			}
		}

		//print result
		for(int i=0;i<rowa;i++)
		{
			for(int j=0;j<colb;j++)
			{
				System.out.print(t[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Matrix 1 : ");
		for(int i=0;i<rowa;i++)
		{
			for(int j=0;j<cola;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix 2 : ");
		for(int i=0;i<rowb;i++)
		{
			for(int j=0;j<colb;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	public void display()
	{
		System.out.println("Matrix 1 : ");
		for(int i=0;i<rowa;i++)
		{
			for(int j=0;j<cola;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("Matrix 1 : ");
		for(int i=0;i<rowb;i++)
		{
			for(int j=0;j<colb;j++)
			{
				System.out.print(b[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
class IntegerNumberMultiplication implements Multiplication{
	int no1,no2;
	IntegerNumberMultiplication(int a,int b)
	{
		no1=a;no2=b;
	}
	public void multiplication()
	{
		System.out.println("After multipliying: " + no1*no2);
	}
	public void display()
	{
		System.out.println("Number 1: " + no1 + "\tNumber 2: " + no2);
	}
}
class intrfc2{
	public static void main(String args[])
	{
		//instansiation
		MatrixMultiplication mp1=new MatrixMultiplication(2,3,3,4);
		IntegerNumberMultiplication np1 = new IntegerNumberMultiplication(236,576);
		//multipliying intigers and displaying
		IntegerNumberMultiplication.multiplication();
		IntegerNumberMultiplication.display();
		//multipliying matrix and displaying
		MatrixMultiplication.read();
		MatrixMultiplication.multiplication();
		MatrixMultiplication.display();
	}
}

/*
1.	Declare an interface called Property containing a method computePrice to compute and return the price.
	The interface is to be implemented by following two classes i) Bungalow and ii) Flat.
	Both the classes have following data members
	-	name
	-	constructionArea
	The class Bungalow has an additional data member called landArea.
	Define computePrice for both classes for computing total price.
	Use following rules for computing total price by summing up sub-costs:
          Construction cost(for both classes):Rs.500/- per sq.feet
          Additional cost 	( for Flat)     	: Rs. 200000/-
				( for Bungalow )	: Rs. 200/- per sq.feet
	for landArea
	Land cost  ( only for Bungalow ): Rs. 400/- per sq. feet
	Define method main to show usage of method computePrice.
2.	Interface named Multiplication has two methods, multiplication and display.
	Class MatrixMultiplication and IntegerNumberMultiplication implements Multiplication.
	Write a program for the above condition. Provide appropriate data for the calculation and show output.
							jdk jvm jre
							how to set claSS PATH(temp/permanent) WHY?
*/
import java.util.Scanner;
public interface property{
	double computeprice();
}
class Flat implements property{
	string name;
	int area;
	Flat()
	{
		Scanner sc = new Scanner(system.in);
		System.out.print("Enter Name:");
		name=sc.next();
		System.out.print("Enter Area:");
		area=sc.nextInt();
	}
	public double computeprice(){
		double cost;
		cost = 500*area + 200000;
		return cost;
	}
}
class Bungalow implements property{
	String name;
	int area;
	int landArea;
	/*
	double computelandcost(){
		double cost;
		cost=400*area;
		return cost;
	}*/
	Bungalow(){
		Scanner sc = new Scanner(system.in);
		System.out.print("Enter Name:");
		name=sc.next();
		System.out.print("Enter Area:");
		area=sc.nextInt();
		System.out.print("Enter LandArea:");
		landArea=sc.nextInt();
	}
	public double computeprice(){
		double cost;
		cost=(500+200)*area + 400*landArea;
		return cost;
	}
}
class intrfc{
	public static void main(String args[])
	{
		Flat f1=new Flat();
		Bungalow b1=new Bungalow();
		System.out.println("Price of Flat1 :" + f1.computeprice());
		System.out.println("Price of Bungalow1 :" + b1.computeprice());
	}
}/*
1.	Declare an interface called Property containing a method computePrice to compute and return the price.
	The interface is to be implemented by following two classes i) Bungalow and ii) Flat.
	Both the classes have following data members
	-	name
	-	constructionArea
	The class Bungalow has an additional data member called landArea.
	Define computePrice for both classes for computing total price.
	Use following rules for computing total price by summing up sub-costs:
          Construction cost(for both classes):Rs.500/- per sq.feet
          Additional cost 	( for Flat)     	: Rs. 200000/-
				( for Bungalow )	: Rs. 200/- per sq.feet
	for landArea
	Land cost  ( only for Bungalow ): Rs. 400/- per sq. feet
	Define method main to show usage of method computePrice.
2.	Interface named Multiplication has two methods, multiplication and display.
	Class MatrixMultiplication and IntegerNumberMultiplication implements Multiplication.
	Write a program for the above condition. Provide appropriate data for the calculation and show output.
							jdk jvm jre
							how to set claSS PATH(temp/permanent) WHY?
*/
import java.util.Scanner;
public interface property{
	double computeprice();
}
class Flat implements property{
	String name;
	int area;
	Flat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name:");
		name=sc.next();
		System.out.print("Enter Area:");
		area=sc.nextInt();
	}
	public double computeprice(){
		double cost;
		cost = 500*area + 200000;
		return cost;
	}
}
class Bungalow implements property{
	String name;
	int area;
	int landArea;
	/*
	double computelandcost(){
		double cost;
		cost=400*area;
		return cost;
	}*/
	Bungalow(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name:");
		name=sc.next();
		System.out.print("Enter Area:");
		area=sc.nextInt();
		System.out.print("Enter LandArea:");
		landArea=sc.nextInt();
	}
	public double computeprice(){
		double cost;
		cost=(500+200)*area + 400*landArea;
		return cost;
	}
}
class intrfc{
	public static void main(String args[])
	{
		System.out.println("Flat1 Details:");
		Flat f1=new Flat();
		System.out.println("Bungalow1 Details:");
		Bungalow b1=new Bungalow();
		System.out.println("Price of Flat1 :" + f1.computeprice());
		System.out.println("Price of Bungalow1 :" + b1.computeprice());
	}
}


/*
2.	Write a program to increment the value of one variable by one and display it after one second using thread.
*/
class Mythread extends Thread{
	public void run(){
		for(int i=0;i<40;i++)
		{
			System.out.println(i);
			try{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.print("error 1");
			}
		}
	}
}
class DelayCounter{
	public static void main(String a[]){
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		System.out.println("Thread 1");
		t1.start();
		System.out.println("Thread 2");
		t2.start();
	}
}

class PrimeThread extends Thread {
    int a,b;
    PrimeThread(){
        a=0;
        b=10;
    }
    PrimeThread(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public void run(){
        for(int i=a;i<b;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.print(i + "\t");
        }
    }
}
class PrimeThread2 implements Runnable{
    int a,b;
    PrimeThread2(){
        a=0;
        b=10;
    }
    PrimeThread2(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public void run(){
        for(int i=a;i<b;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.print(i + "\t");
        }
    }
}
public class Multithread{
    public static void main(String a[]){
        PrimeThread t1=new PrimeThread(3,30),t2=new PrimeThread();
		PrimeThread2 tt1=new PrimeThread2(3,30),tt2=new PrimeThread2();
		Thread T1=new Thread(tt1),T2=new Thread(tt2);
		System.out.println("\nThread 1.1");
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException e){
            System.out.print("Error 1");
        }
		System.out.println("\nThread 1.2");
        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException e){
            System.out.print("Error 2");
        }
		System.out.println("\nThread 2.1");
        T1.start();
        try{
            T1.join();
        }
        catch(InterruptedException e){
            System.out.print("Error 21");
        }
		System.out.println("\nThread 2.2");
        T2.start();
        try{
            T2.join();
        }
        catch(InterruptedException e){
            System.out.print("Error 2");
        }
    }
}


class Exception2{
	public static void main(String args[])
	{
		try{
			int a=4,b=0,c=1;
			a=b/c;
			Exception e=new Exception();
			throw e;
		}
		catch(Exception e){
			System.out.println("Divide by zero error");
		}
	}
}


/*
3.	Assume one class Queue that defines queue of fix size says 15.
•	Assume one class producer which implements Runnable, having priority NORM_PRIORITY +1
•	One more class consumer implements Runnable, having priority NORM_PRIORITY-1
•	Class TestThread is having main method with maximum priority, which creates 1 thread for producer and 2 threads for consumer.
•	Producer produces number of elements and put on the queue. when queue becomes full it notifies other threads.
•	Consumer consumes number of elements and notifies other thread when queue become empty..
*/

class Queue{
	int[] a;
	int f,r,l;
	Queue()
	{
		a=new int[10];
		f=-1;r=-1;
		l=10;
	}
	Queue(int n)
	{
		a=new int[n];
		f=-1;r=-1;
		l=n;
	}
	synchronized void produce()
	{
		try{
			while(size()>l)
			{
				System.out.println("Producer waiting !!");
				wait();
			}
			while(true)
			{
				if(f==-1)
				{
					f=0;r=0;
					a[r]=1;
					//System.out.println("\nItem produced: " + 1);
					disp();
					notifyAll();
					try{
						Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{
						System.out.print("error 1");
					}
				}
				else if((r+1)%l==f)
				{
					System.out.println("\nItem not produced(overflow)!");
					//disp();
					notifyAll();
					//while(size()>l){
						System.out.println("Producer waiting !!");
						wait();
					//}
					try{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						System.out.print("error 1");
					}
				}
				else
				{
					r=(r+1)%l;
					a[r]=1;
					//System.out.println("\nItem produced: " + 1);
					disp();
					notifyAll();
					try{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						System.out.print("error 1");
					}

				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Catch p");
		}
	}
	synchronized void consume()
	{
		try
		{
			while(size()<1)
			{
				System.out.println("Consumer waiting !!");
				wait();
			}
			while(true)
			{
				if(f==-1)  //empty
				{
					System.out.println("\nItem not consumed(Underflow): ");
					//disp();
					notifyAll();
					//while(size()<1){
						System.out.println("Consumer Waiting !!");
						wait();
					//}
					try{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						System.out.print("error 1");
					}
				}
				else if(f==r)	//last element
				{
					f=-1;
					r=-1;
					//System.out.println("\nItem consumed: ");
					disp();
					notifyAll();
					try{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						System.out.print("error 1");
					}

				}
				else
				{
					f=(f+1)%l;
					//System.out.println("\nItem consumed: ");
					disp();
					notifyAll();
					try{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						System.out.print("error 1");
					}

				}
			}
		}
		catch(Exception e){
			System.out.println("Error c");
		}
	}
	synchronized void disp()
	{
		int i;
		if(f==-1)
			System.out.println("\nQueue is Empty!!");
		else
		{
			for(i=f;i!=r;i=(i+1)%l)
			{
				System.out.print(a[i] + "\t");
			}
			System.out.println(a[i]);
		}
	}
	synchronized int size(){
		int i;
		int x=0;
		if(f==-1)
			return 0;
		else
		{
			for(i=f;i!=r;i=(i+1)%l)
				x++;
			x++;
			return x;
		}
	}
}

class Producer implements Runnable{
	Queue q1;
	Producer(Queue q)
	{
		q1=q;
	}
	public void run(){

		q1.produce();
		/*try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.print("error 1");
		}*/
		//System.out.println("Thread producer Notifying other");
		//try{notifyAll();}catch(Exception e){}
		System.out.println("End of Producer !");
	}
}
class Consumer implements Runnable{
	Queue q1;
	Consumer(Queue q)
	{
		q1=q;
	}
	public void run(){

		q1.consume();
		/*try{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.out.print("error 1");
		}*/

		System.out.println("End of Comsumer !");

	}
}

class PCQueue{
	public static void main(String args[])
	{
		Queue q1=new Queue(5);
		Producer p1=new Producer(q1);
		Consumer c1=new Consumer(q1),c2=new Consumer(q1);
		Thread t1=new Thread(p1),t2=new Thread(c1),t3=new Thread(c2);

		//t1.setPriority(6);
		//t2.setPriority(4);
		//t3.setPriority(4);
		///System.out.println("Priorities: " + t1.getPriority() + t2.getPriority() + t3.getPriority());
		System.out.println("Thread p1");
		t1.start();
		System.out.println("Thread c1");
		t2.start();
		System.out.println("Thread c2");
		t3.start();
		System.out.println("End of Main");
	}
}
