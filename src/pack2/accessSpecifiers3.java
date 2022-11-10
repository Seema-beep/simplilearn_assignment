package pack2;

import pack1.proAccessSpecifiers;

public class accessSpecifiers3 extends proAccessSpecifiers {

	public static void main(String[] args) {
		//protected access specifier in another package
		System.out.println("Protected Access Specifier");
		accessSpecifiers3 obj=new accessSpecifiers3();
		obj.display();

	}

}
