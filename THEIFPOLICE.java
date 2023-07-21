
import java.util.*;
public class THEIFPOLICE {

	public static void main(String[] args)
	{
		int n,i,k,c=0,j;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter size of array");
		
		n=x.nextInt();
		char a[]=new char[n];
		for(i=0;i<n;i++)
		{
			a[i]=x.next().charAt(0);
		
		}
       System.out.println("Enter the num ");
		k=x.nextInt();

for(i=0;i<n;i++)
{

if(a[i]=='P')
{
//System.out.println("ITS P");

for(j=1;j<=k;j++)
{
if(i<k)
{

if(a[i+j]=='T')
{
c++;
break;
}

}

else if(i>=n-k-1)
{
if(a[i-j]=='T')
{
c++;
break;
}

}
else if(a[i+j]=='T'||a[i-j]=='T')
 {
    c++;
   break;
}



}
}
//System.out.println("output: "+c);


}


System.out.println("output: "+c);

}}
