
public class Queue_1 
{
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nElems;
	
	public Queue_1(int s)
	{
		maxSize=5;
		queArray=new long[maxSize];
		front=0;
		rear=-1;
		nElems=0;
	}
	
	public void insert(long newData)
	{
		if(rear==maxSize-1)
		rear=-1;
	    queArray[++rear]=newData;
	    nElems++;
	    return;
	}
	
	public long remove()
	{
		long temp=queArray[front++];
		front=0;
		nElems--;
		return temp;
	}
	public long peekFront()
	{
		return queArray[front];
	}
	
	public boolean isEmpty()
	{
		return (nElems==0);
	}
	
	public boolean isFull()
	{
		return (nElems==maxSize);
	}
	public int size()
	{
		return nElems;
	}
}
