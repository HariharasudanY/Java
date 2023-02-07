import java.util.*;
class negative
{
public static void main(String args[])
{
int n;
int i;
int j;
int count=0;
int count1=0;
System.out.print("no of inputs");
Scanner s=new Scanner(System.in);
n=s.nextInt();

int a[]=new int[n];

for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("the elements are");


for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(i=0;i<n;i++)
{
if(a[i]<0)
{
count++;
}
}
System.out.println(count);
for(i=0;i<n;i++)
{
if(a[i]>0)
{
count1++;
}
}
System.out.println(count1);
if(count>count1)
{System.out.println("true");}
else
{System.out.println("false");}



}
}





class rotation
{
public static void main(String args[])
{
int n;
int i;
int j;
int count=0;
int count1=0;
System.out.print("no of inputs");
Scanner s=new Scanner(System.in);
n=s.nextInt();

int a[]=new int[n];

for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("the elements are");


for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
count=a[0];
a[0]=a[n-1];

System.out.println("the elements are");

System.out.println(a[0]);

for(i=1;i<n-1;i++)
{
a[i]=count;
count=a[i+1];

System.out.println(a[i+1]);

}


}
}






class RotateElements
 {    
 public static void main(String[] args) 
{    
     
        int [] arr = new int [] {1, 2, 3, 4, 5};     
        
        int n = 1;    
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) 
      {     
           
 System.out.print(arr[i] + " ");   
  
        }      
         
        for(int i = 0; i < n; i++)
{    
            int j, last;       
            last = arr[arr.length-1];    

            for(j = arr.length-1; j > 0; j--)
             arr[j] = arr[j-1];    
          
  }      
            arr[0] = last;    
        }    
        
        System.out.println();    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }    
    }    
}







class Twodarray{
public static void main(String args[])
{
int arr[] []={{1,2,3},{4,5},{6,7,8,9}};
for(int i=0;i<3;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i] [j]+ "  ");}
System.out.println( );
}
}}

