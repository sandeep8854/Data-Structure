
public class Link1 
{
	public int iData;  //data item key
	public double dData;//data item
	public Link1 next;   //next link in list
	
	public Link1(int id,double dd)
	{
		iData=id;
		dData=dd;
	}
	
	public void display()
	{
		System.out.println("{"+iData+","+dData+"}");
	}
}
