import java .util.*;

class pell
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number of series: ");
int n= sc.nextInt();
sc.close();
int a,b,c,i ;
a=0;
b=1;
System.out.print(a +" "+b+" ");


for(i=2;i<n;i++)
{

c=(b*2)+a;
System.out.print(c +" ");

a=b;
b=c;

}





}}



class cric
{
public static void main(String args[])
{
int i,j,count=0;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number of series: ");
int n= sc.nextInt();

int a[]=new int[n];
System.out.print("Enter the numbers: ");

for(i=0;i<n;i++)
{

a[i]=sc.nextInt();
}


for(i=0;i<n;i++)
{
if(i==0)
{
System.out.println(a[i]+"no prev assesment");
}

else

{
if(a[i-1]<a[i])
{
System.out.println(a[i]+"(Increased)");
count++;
}

else
{
System.out.println(a[i]+"(Decreased)");
}



}





}


System.out.println("The count is "+count);




}}