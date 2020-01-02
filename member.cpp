#include <iostream>
#include<conio.h>

class product
{
	int number;
	float cost;
	public :
		void getdata(int a,float b);
		void putdata()
		{
			cout<<"number = "<<number;
			cout<<"cost = "<<cost;
		}
};
void product :: getdata(int a, float b)
{
	number = a;
	cost = b;
}
void main()
{
	product p;
	p.getdata(7,7.2);
	p.putdata();
	getch();
}
