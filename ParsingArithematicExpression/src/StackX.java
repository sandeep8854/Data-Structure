
public class StackX 
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackX(int s)  //constructor
	{
		maxSize=s;
		stackArray=new char[maxSize];
		top=-1;
	}
	
	public void push(char j)  //put item on top of the Stack;
	{
		stackArray[++top]=j;
	}
	
	public char pop()   //taken item from top of the Stack
	{
		return stackArray[top--];
	}
	
	public char peek()   //peek at top of stack
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()   //true is stack is empty;
	{
		return top==-1;
	}
	
	public int size()  //return size;
	{
		return top+1;
	}
	
	public char peekN(int n)  //return item at index n
	{
		return stackArray[n];
	}
	
	public void displayStack(String s)
	{
		System.out.print(s);
		System.out.print(" Satck (bottom--->top): ");
		for(int j=0;j<size();j++)
		{
			System.out.print(peekN(j));
			System.out.print(' ');
		}
		System.out.println(" ");
	}
}


