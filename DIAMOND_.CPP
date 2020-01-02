#include<iostream.h>
#include<conio.h>
void main()
{
	int i,j,n;
	clrscr();
	cout<<"Enter value";
	cin>>n;

	for(i=0;i<=n;i++)
	{
		cout<<"\n";
		for(j=i;j<=n-1;j++)
		{
			cout<<" ";
		}
		for(j=0;j<i;j++)
		{
			cout<<" *";
		}
	}
	for(i=n-1;i>0;i--)
	{
		cout<<"\n";
		for(j=i;j<=n-1;j++)
		{
			cout<<" ";
		}
		for(j=0;j<i;j++)
		{
			cout<<" *";
		}
	}


	getch();
}

