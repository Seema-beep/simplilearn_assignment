package exceptionHandlingProblems;
//a program to demonstrate throws keyword
public class ThrowsDemo {
	void Division()throws ArithmeticException{
		int a=45,b=0,rs;
		rs=a/b;
		System.out.println("\n\tThe result is:"+rs);
	}

	public static void main(String[] args) {
		ThrowsDemo t=new ThrowsDemo();
		try {
			t.Division();
		}
		catch(ArithmeticException Ex) {
			System.out.println("\n\tError:"+Ex.getMessage());
			
		}
		System.out.println("\n\t End of the program");
		

	}

}
