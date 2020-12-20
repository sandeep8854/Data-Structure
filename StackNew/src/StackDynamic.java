public class StackDynamic 
{
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public StackDynamic(int size)
	{
		maxSize=size;
		stackArray=new int[maxSize];
		top=-1;
	}
	
	 public void push(int value) {
	        if (!isFull()) { // Checks for a full stack
	            top++;
	            stackArray[top] = value;
	        } else {
	            resize(maxSize * 2);
	            push(value);// don't forget push after resizing
	        }
	    }
	 
	 //remove top of the element of the stack and return the value you are removed
	 //return value popped off the stack
	 public int pop()
	 {
		 if(!isEmpty())
		 {
			 return stackArray[top--];
		 }
		 if(top<maxSize/4)
		 {
			 resize(maxSize/2);
			 return pop();  //don't forget pop after resizing
		 }
		 else {
			 System.out.println("The Stack is Already Empty");
			 return -1;
		 }
	 }
	 
	 public int peek()
	 {
		 if(!isEmpty())
		 {
			 return stackArray[top];
		 }
		 else {
			 System.out.println("Stack is Empty Can't Peek");
			 return-1;
		 }
	 }
	 
	 
	 private boolean isEmpty()
	 {
		return (top==-1);
	}

	private void resize(int newSize) {
		int[] transFreArray=new int[newSize];
		for(int i=0;i<stackArray.length;i++)
		{
			  transFreArray[i]=stackArray[i];
			       stackArray =transFreArray;
		}
		        maxSize=newSize;
	}

	private boolean isFull() 
	{
		return (top+1==maxSize);
	}
	
	public void makeEmpty()
	{
		top=-1;
	}
	
	public static void main(String[] args)
	{
		StackDynamic mystack=new StackDynamic(2);
	/*	mystack.push(5);
		mystack.push(8);
		mystack.push(2);
		mystack.push(9);*/
		
		System.out.println("********Stack Array Implementation**********");
		
		//System.out.println(mystack.peek());
		System.out.println(mystack.pop());
	/*	System.out.println(mystack.isEmpty());
		System.out.println(mystack.isFull());
		
		System.out.println(mystack.peek());
		
		System.out.println(mystack.pop());
		System.out.println(mystack.peek());
		System.out.println(mystack.pop());
		System.out.println(mystack.peek());
		System.out.println(mystack.pop());
		System.out.println(mystack.peek());
		
		System.out.println(mystack.isEmpty());*/
		
		
		
		
		
	}
}





























