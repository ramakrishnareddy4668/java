package rk;

public class methods {

	double add3(int a,float b,double c)
			{
				double d=a+b+c;
				return d;
				
			}
	public static void main(String[] args) {
		methods m=new methods();
		double d=m.add3(8, 1.0f,1.200000d);
		System.out.println(d);
		

	}

}
