package rk;

import java.util.Scanner;


public class prime {

	public static void main(String[] args) {
		//int j;
		System.out.println("please enter j value ");
		Scanner ss=new Scanner(System.in);
		int j=ss.nextInt();
		
	for(int n=j;n<=1000;n++)
	{
		int count=0;
		for(int r=1;r<=1000;r++)
	
		{
			if(n%r==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println(n);
		}

	}
	ss.close();
		
	}

}
