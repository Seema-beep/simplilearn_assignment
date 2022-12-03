
public class innerclassAssisted2 {
	private String msg="Inner classes";
	void display() {
		class Inner{
			void msg() {
				System.out.println(msg);
			}
		}
		Inner I=new Inner();
		I.msg();
	}

	public static void main(String[] args) {
		innerclassAssisted2 ob=new innerclassAssisted2();
		ob.display();
		

	}

}
