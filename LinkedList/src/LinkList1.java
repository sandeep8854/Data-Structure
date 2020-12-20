
public class LinkList1
{
	private Link1 first;     //reference to first link to list
	
	LinkList1()
	{
		first=null;    //no item on list yet
	}
	
	public boolean isEmpty()   //true is list is Empty
	{
		return (first==null);
	}
	
	public void insertList(int id,double dd)
	{
		Link1 newLink1=new Link1(id,dd);
		newLink1.next=first;                 //newLink---->>oldFirst
		first=newLink1;
	}
	
	public Link1 find(int key)
	{
	  Link1 current=first;
	  while(current.iData!=key)
	  {
		  if(current.next==null)
			  return null;  //did't find it
		  else
			  current=current.next;
	  }
		return current;
	}
	
	public Link1 deletefirst(int key)
	{
		Link1 current=first;  //search for link
		Link1 previous=first;
		while(current.iData!=key)
		{
			if(current.next==null)
				return null;
			else
			{
				previous=current;   //go to next line
				current=current.next;
			}
		}
		if(current==first)
			first=first.next;
		else
			previous.next=current.next;
		return current;
	}
	
	public void displayList1()
	{
		System.out.println("List (first--->>last): ");
		Link1 current=first;//start at begnning
		while(current!=null)   //until end of list
		{
			current.display();
			current=current.next;  //move to next link
		}
		System.out.println(" ");	
	}
}
