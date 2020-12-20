
public class StackApp
{
	public static void main(String[] args)
	{
		StackX theStack=new StackX(10);    //make new stack
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		
		while(!theStack.isEmpty())    //make new stack
		{
			long value=theStack.top();  //delete item from stack
			System.out.println(value);
			
			System.out.println(" ");
		}
	}
}
