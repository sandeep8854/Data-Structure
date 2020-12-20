import java.util.NoSuchElementException;

public class Queue_1 
{
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public Queue_1()
	{
		this.front=null;
		this.rear=null;
		this.length=0;
	}
	
	private class ListNode
	{
		private int data;
		private ListNode next;
	
	public ListNode(int data)
	{
		this.data=data;
		this.next=next;
	}
}
	public int length()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length==0;
	}
	public void enQueue(int data)
	{
		ListNode temp=new ListNode(data);
		if(isEmpty())
		{
			front=temp;
		}
		else
		{
			rear.next=temp;
		}
		rear=temp;
		length++;
	}
	public void print()
	{
		if(isEmpty())
		{
			return;
		}
		ListNode current=front;
		while(current!=null)
		{
			System.out.print(current.data+ "--->");
			current=current.next;
		}
		System.out.println("null");
	}
	public int deQueue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Queue is already empty.");
		}
		int result=front.data;
		   front=front.next;
		   if(front==null)
		   {
			   
			 rear=null;
		   }
		   length--;
		   
		   return result;
	}
	public int firstElements()
	{
		if(isEmpty())
		{
				throw new NoSuchElementException("Queue is already empty.");
		}
		return front.data;
	}
	
	public int lastElements()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Queue is already empty.");
		}
		return rear.data;
	}
	public static void main(String[] args)
	{
		Queue_1 queue=new Queue_1();
		queue.enQueue(10);
		queue.enQueue(15);
		queue.enQueue(20);
		queue.print();
		System.out.println(queue.firstElements());
		
		System.out.println(queue.lastElements());
		/*queue.enQueue(25);
		
		queue.enQueue(50);
		
		queue.print();
		
	  queue.deQueue();
	  queue.print();
	  queue.deQueue();
	  queue.print();
	  
	  queue.deQueue();
	  queue.print();
	  queue.deQueue();
	  queue.print();
		
	  queue.deQueue();
	  queue.print();
	  queue.deQueue();
	  queue.print();*/
	  
	  
	}

}
