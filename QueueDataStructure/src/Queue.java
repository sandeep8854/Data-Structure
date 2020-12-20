
public class Queue 
{
	private int  maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nElems;
	
	public Queue(int s)
	{
		maxSize=s;
		queArray=new long[maxSize];
		front=0;
		rear=-1;
	}
	
	public void insert(long j)
	{
		if(maxSize-1==rear)
		{
			System.out.println("Queue is fulled");
		}
		else
		{
			queArray[++rear]=j;
		}
		
	}
	
	public long delete() 
	{
		if(front==rear)
			System.out.println("Queue is Empty");
			
		long tamp=queArray[front++];
		return tamp;
		
		}
	
	public void printQueue() {
		if(front==rear)
			System.out.println("Queue is Empty");
		
		for(int i=front; i<=rear;i++)
			System.out.print(queArray[i]+" ");
	}
	
	/*public void traverse()
	{
		if(front==rear)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Queue Element:");
			for(int i=front;i<rear;i++)
			{
				System.out.println(queArray[i]+ " ");
			}
		}
		
	}*/

}
