
public class callMethod {
	int val=150;
	int operation(int val) {
		val=val*10/100;
		return (val);
	}


	public static void main(String[] args) {
		callMethod d=new callMethod();
		System.out.println("Before operation the value of d is"+d.val);
		d.operation(100);
		System.out.println("After operation the value of d is"+d.val);
		
		

	}

}
