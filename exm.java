import java.io.*;
class Aphabetic
{
public static void main(String args[]) throws IOException
{
String str;
char s[];
DataInputStream in = new DataInputStream(System.in);
System.out.print("Enter String: ");
str = in.readLine();
s = str.toCharArray(); // Convert String into Character Array
for(int i=0; i<str.length(); i++)
{
for(int j=0; j<str.length(); j++)
{
if(s[i] <= s[j])
{
char temp = s[i];
s[i] = s[j];
s[j] = temp;
}
}
}
System.out.println("After sorting the string...");
System.out.println(s);
}
}
