import java.util.*;

class perfect
{
public static void main(String args[])
{


Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int a=sc.nextInt();

int i,c;
int b=0;
for(i=1;i<=a;i++)
{
c=i*i;
 if(a==(c))
{

   b=1;
break;
}
else
{
b=0;
}


}

if(b==1)
{

System.out.print("The given number is a perfect square");
}
else
{
System.out.print("The given number is not a perfect square");
}



}


}
