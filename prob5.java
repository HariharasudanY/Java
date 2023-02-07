import java.util.*;
import java.util.Arrays;

class pattern
{
public static void main(String args[])
{
int i,j=0,count=0;
Scanner sc=new Scanner(System.in);
char m,o,k;
System.out.print("Enter the no of grids ");
int n=sc.nextInt();

char a[]=sc.next().toCharArray();


for(i=0;i<n;i++)

{

if(a[i]=='(')
{

if(a[i+1]==')')

{


}
else
j=i;
System.out.println(j);

}

}







}

}

