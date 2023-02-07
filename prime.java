import java .util.*;

class prime
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();
int i,j,flag=0 ;
for(i=2;i<=n;i++)
{

for(j=2;j<i;j++)
{

if((i%j)==0)
{
flag=1;
break;
}
else
{
flag=0;
}

}

if(flag==0)
{
System.out.println(i);
}

}
}
}