package rk;

public class calcu_methods {
	
	int add(int a1,int a2)
	{
		int a3=a1+a2;
		return a3;
	}
	int sub(int s1,int s2)
	{
		int s3=s1-s2;
		return s3;
		
	}
	int mul(int m1,int m2)
	{
		int m3=m1*m2;
		return m3;
		
	}
	int div(int d1,int d2)
	{
		int d3=d1/d2;
		return d3;
	}



	public static void main(String[] args) 
	{
		calcu_methods cm=new calcu_methods();
		int a3=cm.add(5,10);
		int s3=cm.sub(10, 5);
		int m3=cm.mul(5, 10);
		int d3=cm.div(10, 5);
		System.out.println(a3);
		System.out.println(s3);
		System.out.println(m3);
		System.out.println(d3);

		
	}

	}


