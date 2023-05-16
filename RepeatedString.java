package divum;

import java.util.*;

public class RepeatedString {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter size of array");
		    int n =sc.nextInt();
		    String[] a = new String[n];
		    int b[]=new int[n];
        int i,j,k=0;
		    System.out.print("Please enter names");

		    for (i = 0; i < n; i++) {
		        a[i] = sc.next();
		    }
		    sc.close();
		    
		  /*  for ( i = 0; i < n; i++) {
			    System.out.println(a[i]+" ");
		    }*/
		    
		    int count=0;
		    for(i=0;i<n;i++)
		    {     b[i]=0;
		    	for(j=i;j<n;j++)
		    	{
		    		if(a[i].equals(a[j]))
		    			b[i]+=1;
		    	}

		    }
		    
		    int t;
		    String s;
		    for(i=0;i<n;i++)
		    {
		    	for(j=0;j<n;j++)
		    	{
		    		if(b[i]<b[j])
		    		{
		    			t=b[i];
		    			b[i]=b[j];
		    			b[j]=t;
		    			s=a[i];
		    			a[i]=a[j];
		    			a[j]=s;
		    		}
		    	}
		    	
		    }
		    
		 /*   for(i=0;i<n;i++)
		    {
		    	
    			System.out.print(b[i]+" ");

		    }*/
		    
		 // int count=0; 
		   for(i=0;i<n;i++)
		    {  
		    	if(b[i]>1)
		    	{	System.out.print(a[i]+"  ");
		       count++;
		    	}
		    	
		    	
		    }
		   
		     System.out.println("No of repeated Strings"+ count);
		     
		  System.out.printf("\ncount:%d and string: %s\n",b[n-1],a[n-1]);
		  for(i=1;i<n;i++)
		  {    
			  if(b[n-i]>1)
			  {
			  if(b[n-i-1]==b[n-i])
				  System.out.printf("count:%d and string: %s\n",b[n-i-1],a[n-i-1]);
			  }
				  
		  }
		  
		     	 
	}

}
