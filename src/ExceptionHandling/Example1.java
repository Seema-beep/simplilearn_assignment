package ExceptionHandling;

import java.util.Arrays;

class MyException extends Exception{
	String str1;

	public MyException(String str2) {
		super();
		str1 = str2;
	}

	@Override
	public String toString() {
		return("MyException occured:"+str1);
	}
	
	
	
	
}



public class Example1 {

	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			//I am throwing the custom exception using throw
			
			throw new MyException("This is my error message");
		}
		catch(MyException exp) {
			System.out.println("Catch Block");
			System.out.println(exp);
			
		}
		

	}

}
