package pack1;
class priAccessSpecifier{
	private void display() {
		System.out.println("You are using private access specifier");
	}
}


public class accessSpecifiers2 {

	public static void main(String[] args) {
   //private
		System.out.println("Private Access Specifier");
		priAccessSpecifier obj=new priAccessSpecifier();
		//trying to access private method of another class
		//obj.display();

	}

}
