 class LinkList 
{
	private Link first; //ref to first item on list
	
	public LinkList()
	{
		first=null;  //no item list yet
	}
	
	public boolean isEmpty()
	{
		return (first==null);
	}
	
	public void insertFirst(long dd)
	{
		Link newLink=new Link(dd);
		newLink.next=first;
		first=newLink;
	}
	
	public long deleteFirst()
	{
		Link temp=first;
		first=first.next;
		return temp.dData; //return delete link
	}
	
	public void displayList()
	{
		Link current=first;
		while(current!=null)
		{
			current.displayLink();
			current=current.next;
		}
		System.out.println(" ");
	}
}



