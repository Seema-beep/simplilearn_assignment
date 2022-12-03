package innerClasses;
abstract class AnonymousInnerClass{
	public abstract  void display();
}

public class innerClassAssisted3 {

	public static void main(String[] args) {
		AnonymousInnerClass i=new AnonymousInnerClass() {
			
			@Override
			public void display() {
				System.out.println("Anonymmous Inner Class");
				
			}
		};
		i.display();

	}

}
