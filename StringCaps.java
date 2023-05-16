package divum;

import java.util.*;

public class StringCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j;
		String a=sc.nextLine();
		sc.close();
		String b[]=a.split(" ");
		
		for(i=0;i<b.length;i++)
		{
			String c=b[i];
			System.out.print(c.substring(0,1).toUpperCase());
			System.out.print(c.substring(1, c.length()).toLowerCase()+" ");

		}
	}

}
