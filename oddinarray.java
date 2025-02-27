package rk;

import java.util.Scanner;

public class oddinarray {

	public static void main(String[] args) 
	{
		int z;
		System.out.println("please enter array size ");
		Scanner s=new Scanner(System.in);
		z=s.nextInt();
		
		int a[]=new int[z];
		for(int i=0;i<z;i++)
		{
			a[i]=i;
			System.out.println(a[i]);
			if(i%2==1)
			{
				System.out.println("these are odd numbers "+ a[i]);

			}
			
		}
		
	}

}
