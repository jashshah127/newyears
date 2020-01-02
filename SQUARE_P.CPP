#include<iostream.h>
#include<conio.h>
void main()
{
	int i,j,n;
	clrscr();
	cout<<"\n Enter thye value:";
	cin>>n;
	for(i=1;i<=n;i++)
	{
		cout<<"\n";
		for(j=1;j<=n;j++)
		{
			if(i==1||i==n||j==1||j==n)
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