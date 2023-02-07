import java.util.*;

class CelToFar
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the celcius: ");

float c=sc.nextFloat();


double f =(c *1.8) + 32;

System.out.println("Farenheit is"+f);

}
}



class FarToCel
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Farenheit: ");

float f=sc.nextFloat();


float c=(f-32)* 1.8 ;

System.out.println("Celcius is"+c);

}
}