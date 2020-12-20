
public class LinkList
{
private Link first;      //ref to first link on list
	
	public LinkList()
	{
		first=null;        //no item on list yet
	}
	
	public void insertFirst(int id,double dd)
	{
		Link newLink=new Link(id,dd);
		newLink.next=first;
		first=newLink;
	}
	
	public Link find(int key)
	{
		Link current=first;
		while(current.iData!=key)
		{
			if(current.next==null)
			{
				return null;
			}else
			{
				current=current.next;
			}
		}
		return current;
	}
	
	public Link delete(int key)
	{
		Link current=first;
		Link previous=first;
		while(current.iData!=key)
		{
			if(current.next==null)
			{
				return null;
			}
			else
			{
				previous=current;
				current=current.next;
			}
		}
		if(current==first)
		{
			first=first.next;
		}else
		{
			previous.next=current.next;
		}
		return current;
	}
	
	public void displayList()
	{
		System.out.println(" Last (first--->last): ");
		Link current=first;  //start at beginning of list
		while(current!=null)
		{
			current.displayLink();
			current=current.next;
		}
		System.out.println(" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
