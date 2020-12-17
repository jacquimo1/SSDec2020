package day2;

public interface Shape {
	int calculateArea();
	default void display() {
		System.out.println("Area = " + calculateArea());
	}
}