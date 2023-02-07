import java.util.Scanner;
class sumdigit
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a;
System.out.println("Enter the number ");
a=scan.nextInt();
int sum=0;
int rem;
while(a>0)
{
rem=a%10;
a=a/10;
sum=sum+rem;
}
System.out.println(sum);
}}