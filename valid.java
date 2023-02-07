import java.io.*;
import java.util.*;


class valid
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,flag=0;
System.out.println("Enter the string: ");
String str=sc.nextLine();

System.out.println(str);


for(i=0;i<9;i++)
{

char a=str.charAt(i);





if(a=='A'&&a=='E'&&a=='I'&&a=='O'&&a=='U'&&a=='Y')
{

flag=1;
break;

}

else

{

flag=0;

}

}

for(i=0;i<9;i++)
{
int n=i+(i+1);

if(n%2==0)
{

flag=1;
}
else
{
flag=0;
}

}
if(flag==1)
System.out.println("valid");
else
System.out.println("Invalid");










}}