import java .util.*;

class palindrome
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();
int a=n;
int i,r,rev=0 ;
while(n>0)
{
r=n%10;
n=n/10;
rev=rev*10 + r;

}

if(a==rev)
System.out.println("It is a Palindrome");
else
System.out.println("It is not a Palindrome");

}

}