package rk;

import java.util.Scanner;

public class revstr {

	public static void main() 
	{
		System.out.println("please enter a string");
		Scanner r=new Scanner(System.in);
//		System.out.println("please enter a string");
				String s=r.nextLine();
//		String s="RAMAKRISHNA REDDY";
//		String s="YDDER ANHSIRKAMAR";
		String k="";
		for(int i=s.length()-1;i>=0;i--)
		{
			k=k+s.charAt(i);
		}
		System.out.println("the string reverse of "+ s +" is  " + k);
		
	}

}
