public class SortedList 
{
	private Link first;  //ref to first item on list
	
	public SortedList()  //No argument
	{
		first=null;  //initalize list
	}
	
	public SortedList(Link[] linkArr)  //constructor array as argument
	{
		first=null;//initalize the list
		{
			for(int j=0;j<linkArr.length;j++)
			insert(linkArr[j]);
		}
	}

	private void insert(Link k)  //insert in order
	{
		Link previous=null;   //start at first;
		Link current=first;
		
		while(current!=null && k.dData > current.dData)
		{
			previous=current;
			current=current.next;
		}
		if(previous==null )  //at beginning
		{
			first=k;
		}
		else   //not at beginning
		{
			previous.next=k;   //old pre--> k
			k.next=current;
		}
	}
	
	public Link remove()
	{
		Link temp=first;
		first=first.next;
		return temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
