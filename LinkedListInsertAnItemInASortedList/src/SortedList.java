public class SortedList 
{
	private Link first;  //ref to first item on list
	
	public SortedList()
	{
		first=null;
	}
	
	public boolean isEmpty()
	{
		return (first==null);
	}
	
	public void insert(long key)  //insert at sorting order
	{
		Link newLink=new Link(key);  //make a new Link
		Link previous=null;  //start at first;
		Link current=first;
		
		while(current!=null && key > current.dData)
		{                                        //key  --->current
			previous=current;
			current=current.next;
		}
		if(previous==null)
		{
			first=newLink;
		}
		else
		{
			previous.next=newLink;
		}
		newLink.next=current;
	}
	
	public Link remove()
	{
		Link temp=first;
		first=first.next;
		return temp;
	}
	
	public void dispayList()
	{
		System.out.print(" Last (first-->>Last ");
		Link current=first;
		while(current!=null)
		{
			current.displayLink();
			current=current.next;
		}
		System.out.println(" ");
	}	
	
}
