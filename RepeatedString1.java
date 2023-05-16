package divum;

import java.util.*;

public class RepeatedString1 {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter size of array");
		    int n =sc.nextInt();
		    String[] a = new String[n];
		    int b[]=new int[n];
		    String c[]=new String[n]; 
        int i,j,k=0;
		    System.out.print("Please enter names");

		    for (i = 0; i < n; i++) {
		        a[i] = sc.next();
		    }
		    sc.close();
		    
		    int count=0;
		    for(i=0;i<n;i++)
		    {    count=1;
		    	for(j=i+1;j<n;j++)
		    	{
		    		if(a[i].equals(a[j]))
		    		{
		    			count++;
		    			a[j]="0";
		    		}
		    	}
		    	
		    	
		    	if(count > 1 &&a[i]!="0")
		    	{
		    		//System.out.println(a[i]);
		    	b[k]=count;
		    	c[k++]=a[i];
		    	
		    	}

		    }
		    int t;
		    String s;
		    for(i=0;i<k;i++)
		    {
		    	for(j=i+1;j<k;j++)
		    	{
		    		if(b[i]>b[j])
		    		{
		    			t=b[i];
		    			b[i]=b[j];
		    			b[j]=t;
		    			s=c[i];
		    			c[i]=c[j];
		    			c[j]=s;
		    			
		    			}
		    				
		    	}
		    }
		    
		    for(i=0;i<k;i++)
		    {
		    	System.out.print(b[i]+" "+ c[i]);
		    }
		   
		    
		    
	}}