package day2;


public class Rectangle implements Shape {
	private int length, width;
	
	public Rectangle(int x, int y) {
		this.length = x;
		this.width = y;
	}
	
	@Override
	public int calculateArea() {
		return length * width;
	}


}