package CEC07;

public class Triangle extends Shape{

	public Triangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public float area() {
		return (float) ( 0.5 * a * b ) ; 
	}
	
}
