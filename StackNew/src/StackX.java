public class StackX 
{
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public StackX(int s)   //constructor
	{
		maxSize=s;
		stackArray=new long[maxSize];
		top=-1; //no item yet
	}
	
	public void push(long j)  //push item on top of the stack
	{
		stackArray[++top]=j; //increment top ,insert item
	}
	
	public long pop() //take item for top of the stack
	{
		return stackArray[top--]; //access item decrement top
	}
	
	public long peek() //peek at top of the stack
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()  //true if stack is empty
	{
		return (top==-1);
	}
	
	public boolean isFull()  //true if stack is full
	{
		return (top==maxSize-1);
	}
}
