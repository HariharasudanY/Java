import java.io.*;
import java.util.*;


class series
{
public static void main(String args[])
{
int a,b,n,j,i,d=1,sum=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number : ");
a=sc.nextInt();


System.out.println("Enter the numbeer");
b=sc.nextInt();



System.out.println("Enter the series ");
n=sc.nextInt();

sum=a+b;

System.out.println(sum);

for(i=1;i<n;i++)
{

for(j=1;j<=i;j++)
{
d=d*2;
}

sum=sum+((d*b));


System.out.println(sum);

d=1;

}



}}