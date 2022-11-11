package constructors;
//Automatic initialization using parameterised constructors
class Std{
	int id;
	String name;
	public Std(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}

public class paramConstrDemo {

	public static void main(String[] args) {
		Std st1=new Std(2, "Alex");
		Std st2=new Std(10,"Annie");
		st1.display();
		st2.display();
		
	}

}
