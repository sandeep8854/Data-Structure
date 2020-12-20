public class Link 
{
	public int iData;          //data item (key)
	public double dData;      //data item
	public Link next;        //next link to list
	
	public Link(int id,double dd)
	{
		iData=id;           //initialize data 
		dData=dd;           //next is automatically set to null
	}
	
	public void displayLink()  //display ourself
	{
		System.out.print("{" +iData+ ","+dData+"} ");
	}
}
