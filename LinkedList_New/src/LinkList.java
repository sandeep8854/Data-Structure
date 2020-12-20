public class LinkList
{
	private Link first;      //ref to first link on list
	
	public LinkList()
	{
		first=null;        //no item on list yet
	}
	
	public boolean isEmpty()
	{
		return (first==null);
	}
	
	public void insertFirst(int id,double dd)
	{                 //make a new link
		Link newLink=new Link(id,dd);
		newLink.next=first;
		       first=newLink;
	}
	
	public Link deleteFirst()
	{
		Link temp=first;
		first=first.next;
		return temp;
	}
	
	public void displayList()
	{
		System.out.print("List (first-->last)");
		Link current=first;
		while(current!=null)
		{
			current.displayLink(); //print data
			current=current.next;
		}
		System.out.println(" ");
	}
}
