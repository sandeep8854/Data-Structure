public class Queue
{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int n)
	{
		maxSize=n;
		queArray=new int[maxSize];
		front=0;
		rear=-1;
		nItems=0;
	}
	
	public void insert(int j)
	{
		if(rear==maxSize-1)
			rear=-1;
		queArray[++rear]=j;
		nItems++;
	}
	
	public int remove()
	{
		int temp=queArray[front++];
		if(front==maxSize)
			front=0;
		nItems--;
		return temp;
	}
	
	public int peekFront()
	{
		return queArray[front];
	}
	
	public boolean isEmpty()
	{
		return (nItems==0);
	}
	
	public boolean isFull()
	{
		return (nItems==maxSize);
	}
	
	public int size()
	{
		return nItems;
	}
}                                           