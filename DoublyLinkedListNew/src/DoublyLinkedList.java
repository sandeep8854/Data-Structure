public class DoublyLinkedList
{
	private Link first;     //ref to first item
	private Link last;      //ref to last item
	
	public DoublyLinkedList()  //constructor
	{
		first=null;   //no item on list yet
		last=null;
	}
	
	public boolean isEmpty()  //true if no link
	{
		return first==null;
	}
	
	public void insertFirst(long dd)  //insert at front of list
	{
		Link newLink=new Link(dd);    //make a new lInk
		if(isEmpty()) {
			last=newLink;
		}else {
			first.previous=newLink;
		}
		newLink.next=first;
		first=newLink;
	}
	
	public void insertLast(long dd)
	{
		Link newLink=new Link(dd);
		if(isEmpty())
		{
			first=newLink;
		}else
		{
			last.previous=newLink;
			newLink.previous=last;
		}
		last=newLink;
	}
	
	
	
	
	
	
}
