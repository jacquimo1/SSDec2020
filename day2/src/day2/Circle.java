package day2;

public class Circle implements Shape {
	private int radius;
	
	public Circle(int r) {
		this.radius = r;
	}
	
	@Override
	public int calculateArea() {
		return (int) (Math.PI * Math.pow(radius, 2));
	}


	
}