
public class QueueApp 
{
	public static void main(String[] args)
	{
		Queue theQueue=new Queue(5);
		
		
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		theQueue.insert(50);
		theQueue.delete();
		theQueue.printQueue();
		theQueue.delete();
		System.out.println();
		theQueue.printQueue();
		
		//theQueue.delete();
		
		//theQueue.traverse();
		
	}

}
