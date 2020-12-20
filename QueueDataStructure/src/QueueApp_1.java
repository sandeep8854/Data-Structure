
public class QueueApp_1 
{
	public static void main(String[] args)
	{
		Queue_1 theQueue=new Queue_1(5);
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		
	
		
		while(!theQueue.isEmpty())
		{
		long n=theQueue.peekFront();
		System.out.print(n+ " ");
		}
		System.out.println("");
		
		
	}

}
