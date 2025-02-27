package rk;

import java.util.Arrays;
import java.util.Scanner;

public class greatest_number_in_array {

	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in);
		System.out.println("enter array size");
		int y=r.nextInt();	
		int a[]=new int[y];
		 
		System.out.println("enter array elements");

		for(int i=0;i<y;i++)
		{
			a[i]=r.nextInt();
		
		//	System.out.println(a[i]);
		}
		System.out.println("the elements present inside array are" );
		System.out.println(Arrays.toString(a));

	}

}
