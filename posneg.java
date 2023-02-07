import java.io.*;
import java.util.Scanner;
public class posneg
{
public static void main(String args[])
{
int num;
Scanner k= new Scanner(System.in);
System.out.println("enter the num: ");
num=k.nextInt();
if(num<0)
System.out.println( num+ " is negative");
else
System.out.println( num+ " is positive");
}
}