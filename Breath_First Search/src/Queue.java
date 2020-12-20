
public class Queue
{
	private final int Size=20;
	private int[] queArray;
	private int front;
	private int rear;
	
	
	public Queue()
	{
		queArray=new int[Size];
		front=0;
		rear=-1;
	}
	
	public void insert(int j)  //put item at rear of queue
	{
		if(rear==Size-1)
			rear=-1;
		queArray[++rear]=j;
	}
	
	public int remove()  //take item from front of queue
	{
		int temp=queArray[front++];
		if(front==Size)
			front=0;
		return temp;
	}
	
	public boolean isEmpty()  //true if queue is empty
	{
		return (rear+1==front || (front+Size-1==rear));
	}

}
