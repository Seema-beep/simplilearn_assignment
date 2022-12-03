package abstractionpac;

public class Rectangle extends Shape{
	
	
	


	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}



	double length;
	double width;
	
	
	@Override
	double area() {
		
		return length*width;
	}



	@Override
	public String toString() {
		return "Rectangle color is=" + super.color + ", area=" + area();
	}
	
	
	
	
	

	

}
