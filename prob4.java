import java.util.*;
import java.util.Arrays;

class pattern
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
char m,o,k;
System.out.print("Enter the no of grids ");
int n=sc.nextInt();

char b[]={'a','B','B','B','H'};

char a[]=sc.next().toCharArray();



for(i=0;i<n;i++)
{
m=a[i];
if(a[0]=='H'&&a[n-1]=='H')

{

System.out.println("Yes");
b[i]='H';

}
else

{
System.out.println("No");



}

if(a[i]=='.')
{

b[i]='B';


}


for(i=0;i<n;i++)

System.out.print(b[i]);

}





}
}