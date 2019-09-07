package CEC07;

public class Circle extends Shape {
	
	public Circle(int a) {
		this.a = a;
		this.b = 0;
	}
	
	public float area() {
		return (float) (3.14 * a * a) ;
	}
	
}
