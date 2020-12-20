public class LinkQueueApp
{
	public static void main(String[] args) 
	{
		LinkQueue theQueue=new LinkQueue();
	
		theQueue.insert(40);
		theQueue.insert(60);
		
		theQueue.displayQueue();
		
		theQueue.insert(70);
		theQueue.insert(80);
		
		theQueue.displayQueue();
		
		theQueue.remove();
		theQueue.remove();
		
		theQueue.displayQueue();
		
		
	}

}
