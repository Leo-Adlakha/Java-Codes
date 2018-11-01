package Adapters;

public class StackusingQueue_Pop_Eff_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		StackusingQueue_Pop_Eff stack = new StackusingQueue_Pop_Eff() ;
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		
		stack.display();
		System.out.println(stack.pop()) ;
		
		stack.display();
		System.out.println(stack.peek()) ;
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		
		
	}

}
