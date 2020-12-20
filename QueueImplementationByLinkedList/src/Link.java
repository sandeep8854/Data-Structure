public class Link 
{
	public long iData;
	public Link next;
	
	public Link(long d)
	{
		iData=d;
	}
	
	public void displayLink()
	{
		System.out.print(iData + " ");
	}
}
