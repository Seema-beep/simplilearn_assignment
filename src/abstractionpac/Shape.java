package abstractionpac;
//to demonstrate the use of abstraction

abstract class Shape {
	String color;
	abstract double area();
	public Shape(String color) {
		System.out.println("shape constructor called");
		this.color = color;
	}
	 public String getColor() {
		 return color;
	 }
	

}
