package rk;

import java.util.Scanner;

public class array_elements {

	public static void main(String[] args) {
//		int r[]=new int[10];
//		r[0]=10;
//		System.out.println(r[0]);
//		r[1]=20;
//		System.out.println(r[1]);
//		r[2]=30;
//		System.out.println(r[2]);
//		r[3]=40;
//		System.out.println(r[3]);
//		r[4]=50;
//		System.out.println(r[4]);
		Scanner s=new Scanner(System.in);
		System.out.println("please enter array size");
		int k=s.nextInt();
		Scanner r=new Scanner(System.in);
		System.out.println("please enter a number to get multiples of a number");
		int j=r.nextInt();
		
		int a[]=new int[k+1];
		for(int i=1;i<=k;i++)
		{
			a[i]=i*j;
			System.out.println(j +" X " +i+" =" +a[i]);
		}

		

	}

}
