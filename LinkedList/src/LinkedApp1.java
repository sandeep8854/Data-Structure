
public class LinkedApp1
{
	public static void main(String[] args)
	{
		LinkList1 theList1=new LinkList1();
		theList1.insertList(22,2.99);
		theList1.insertList(44, 4.99);
		theList1.insertList(66, 6.66);
		theList1.insertList(80, 8.99);
		
		theList1.displayList1();
		
		Link1 f=theList1.find(44);
		
		if(f!=null)
			System.out.println("Found link with key " + f.iData);
		else
			System.out.println("Can't find link");
		
		
		Link1 d=theList1.deletefirst(44);
				if(d!=null)
					System.out.println("Deleted Link With key "+d.iData);
				else
					System.out.println("Don't delete link");
				
				theList1.displayList1();
	}
}
