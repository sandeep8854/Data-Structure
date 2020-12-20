
public class Stack 
{
	static final int MAX=1000;
	int top;
	int a[]=new int[MAX];
	boolean isEmpty()
	{
		return(top<0);
	}
	Stack()
	{
		top=-1;
	}
	
	boolean push(int data)
	{
		if(top>=(MAX-1))
		{
			System.out.println("Satck OverFlow");
			return false;
		}
		else
		{
			a[++top]=data;
			System.out.println(data+ " Pushed into stack");
			return true;
		}
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is Overflow");
			return 0;
		}
		else
		{
			int data=a[top--];
			return data;
		}
	}
	int peek()
	{
		if(top<0)
		{
			System.out.println("Stack is overflow");
			return 0;
		}
		else
		{
			int data=a[top];
			return data;
		}
	}
}
