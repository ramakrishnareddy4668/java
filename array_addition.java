package rk;

public class array_addition {

	public static void main(String[] args) {
		
      int a[]=new int[20];
		int b[]=new int[20];
		int c[]=new int[20];
		for(int i=0;i<20;i++)
		{
			a[i]=i;
			b[i]=3*i;
			c[i]=a[i]+b[i];
			
			//System.out.println(  a[i]+"  "+b[i]+"  "+( a[i]+b[i]));		
			System.out.println(a[i]+"  "+b[i]+"  "+c[i]);
		}

		
		
		
		
		
	}

}
