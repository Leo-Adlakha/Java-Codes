package Algorithm_CEC05;

public class Program8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack s = new Stack() ;
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		System.out.println();
		System.out.println("Popped element: " + s.pop()) ;
		s.display();
		System.out.println();
		System.out.println(s.top());
		
	}

}
