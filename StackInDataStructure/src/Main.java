
public class Main 
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.pop()+ "Pupped from stack");
		
		System.out.println(s.peek()+ "top element of the stack ");
		
		System.out.println(s.isEmpty()+ "  nothing is empty value");
		
	}

}
