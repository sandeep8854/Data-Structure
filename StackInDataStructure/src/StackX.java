
public class StackX
{
	private int maxSize;        //size of stack array
	private long[] stackArray;
	private int top;            //top of the stack
	
	public StackX(int s)
	{
		maxSize=s;    //set array size
		stackArray=new long[maxSize]; //create an array
		top=-1;              //no item yet
	}
	
  public void push(long j)  //put item top of the stack
 {
	  stackArray[++top]=j;  //insert item
	//  ++top;
 }
  public long top()
  {
	return stackArray[top--];
  }
  
  public long peek()
  {
	  return stackArray[top];
  }
  public boolean isEmpty()  //true value is empty
  {
	  return (top==-1);
	  
  }
  public boolean isFull()   //true if stack is full
  {
	  return (top==maxSize-1);
  }
}
