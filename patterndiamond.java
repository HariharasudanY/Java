import java.util.*;

class pattern
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();




for(j=1;j<=n;j++)
{
System.out.print("* * ");
}
System.out.println(" ");

for(i=1;i<n;i++)

{

for(j=i;j<n;j++)
{
System.out.print("* ");
}

for(j=1;j<=i;j++)
{
System.out.print("    ");
}


for(j=1;j<=n-i;j++)
{
System.out.print("* ");
}


System.out.println(" ");


}

//lower

for(i=2;i<n;i++)

{
	
for(j=1;j<=i;j++)
{
System.out.print("* ");
}

for(j=i;j<n;j++)
{
System.out.print("    ");
}

for(j=1;j<=i;j++)
{
System.out.print("* ");
}


System.out.println(" ");


}


for(j=1;j<=n;j++)
{
System.out.print("* * ");
}
System.out.println(" ");



}
}







class duck
{
public static void main(String args[])
{
int i,j,r,flag=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

String a=Integer.toString(n);
System.out.println(a.charAt(0));


if(a.charAt(0)=='0')
{

System.out.println("It is not a duck number");

}

else
{

while(n>0)
{

r=n%10;
if(r==0)
{
flag=1;
break;
}
else
flag=0;

n=n/10;

}

if(flag==1)
System.out.println("It is a duck number");

else
System.out.println("It is not a duck number");




}










}}








class median
{
public static void main(String args[])
{
int n,i,c,b;

Scanner sc=new Scanner(System.in);
System.out.println("Enter Array size");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Enter Array elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}

b=n/2;



System.out.println("Given Array");

for(i=0;i<n;i++)
{
   

System.out.print(a[i]+" ");

}

System.out.println(" ");

if(n%2!=0)
{

c=Math.round(b);

System.out.printf("the median is %d \n",a[c]);

}

else
{

float d=(a[b]+a[b-1]);
System.out.printf("the median is %.2f \n",d/2);

}







}}

