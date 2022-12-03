package encapsulationPac;




public class TestEncapsulation {
	public static void main(String args[]) {
		Encapsulate obj=new Encapsulate();
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);
		System.out.println("My name is:"+obj.getName());
		System.out.println("My age is:"+obj.getAge());
		System.out.println("My roll :"+obj.getRoll());
	}
	
	

}
