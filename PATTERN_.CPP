#include<iostream.h>
#include<conio.h>
void main()
{
	int i,j,n;
	clrscr();
	cout<<"\n Enter the value :";
	cin>>n;
	for(i=1;i<=n;i++)
	{
		cout<<"\n";
		for(j=1;j<=n;j++)
		{
			if(j==1||j==n||i==n)
			{
				cout<<" *";
			}
			else
			{
				cout<<"  ";
			}
		}
		for(j=1;j<=n-1;j++)
		{
			if(i==1||i==n)
			{
				cout<<" *";
			}
			else
			{
				cout<<"  ";
			}
		}
	}
	for(i=1;i<=n-1;i++)
	{
		cout<<"\n";
		for(j=1;j<=n;j++)
		{
			if(i==n-1||j==n)
			{
				cout<<" *";
			}
			else
			{
				cout<<"  ";
			}
		}
		for(j=1;j<=n-1;j++)
		{
			if(j==n-1)
			{
				cout<<" *";
			}
			else
			{
				cout<<"  ";
			}
		}
	}
	getch();
}