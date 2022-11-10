package Casting;

public class typeCasting {

	public static void main(String[] args) {
		//implicit conversion
		System.out.println("Implicit type casting");
		char a='A';
		System.out.println("Value of a:"+a);
		int b=a;
		System.out.println("Value of b:"+b);
		float c=a;
		System.out.println("Value of c:"+c);
		long d=a;
		System.out.println("Value of d:"+d);
		double e=a;
		System.out.println("Value of e:"+e);
		System.out.println("\n");
		
		//Explicit type casting
		System.out.println("Explicit type casting");
		double x=45.5;
		int y=(int)x;//converting double to x
		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);

	}

}
