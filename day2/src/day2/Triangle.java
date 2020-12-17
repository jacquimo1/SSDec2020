package day2;

public class Triangle implements Shape {
	private int height, base;
	
	public Triangle(int h, int b) {
		this.height = h;
		this.base = b;
	}
	
	@Override
	public int calculateArea() {
		return height * base / 2;
	}


	
}
