import java .util.Scanner;

class swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter the number ");
a= sc.nextInt();
b= sc.nextInt();
swap1(a,b);

}


static void swap1(int a,int b)
{
int temp;
temp=a;
a=b;
b=temp;
System.out.println(a);
System.out.println(b);



}



}
