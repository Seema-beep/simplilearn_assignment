package pack1;
//Class is having default access specifier

class defAccessSpecifier{
	void display() {
		System.out.println("You are using default access specifier");
	}
}

public class accessSpecifiers1 {

	public static void main(String[] args) {
	//default
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj=new defAccessSpecifier();
		obj.display();

	}

}
