public class StackX1
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackX1(int max)
	{
		maxSize=max;
		stackArray=new char[maxSize];
		top=-1;
	}
	
	public void push(char j)  //put item on top of the stack
	{
		stackArray[++top]=j;
	}
	
	public char pop()  //take item from top of stack
	{
		return stackArray[top--];
	}
	
	
	public char peek()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()  //true if stack is empty
	{
		return (top==-1);
	}
}
