package CEC07;

public class Rectangle extends Shape{

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public float area() {
		return (float) a * b ;
	}
	
}
