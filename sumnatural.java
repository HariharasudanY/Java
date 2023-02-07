import java .io.*;
import java .util.*;
class sum
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();
int i,sum=0 ;
for(i=1;i<=n;i++)
{

sum=sum+i;
}
System.out.println("The sum of first natural numbers is "+sum);
}

}



class sub
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();
int i,sum=0 ;
for(i=1;i<=n;i++)
{

sum=sum-i;
}
System.out.println("The sub of first natural numbers is "+sum);
}

}






class multiple
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();
int i,mul=1 ;
for(i=2;i<=n;i++)
{

mul=mul*i;
}
System.out.println("The fact  numbers is "+mul);
}

}
