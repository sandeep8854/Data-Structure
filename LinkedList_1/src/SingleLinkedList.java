import java.util.*;

public class SingleLinkedList
{
	//private ListNode head; //head node to hold the list;
	public void display(ListNode head)
	{
		if(head==null)
		{
			return;
		}
		ListNode current=head;	
	//loop each element  till end of the list
	//last node point to null
	while(current!=null)
	{
		System.out.print(current.data +"--->"); //print current element's of data 
		//move to next element
		current=current.next;
	}
	System.out.println(current);//here current will be null
		}
	
	//it contains a static inner class ListNode
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
/*	public ListNode insertAtPosition(ListNode head,int data,int position)
	{
		//perform Boundary Checkup
		int size=lenght(head);
		if(position>size+1||position<1)
		{
			System.out.println("Invalid position------");
			return head;
		}
		ListNode newNode=new ListNode(data);
		if(position==1)
		{
			newNode.next=head;
			return newNode;
		}
		else
		{
			ListNode previous=head;
			int count=1;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			newNode.next=current;
			previous.next=newNode;
		}
		return head;	
	}
	public void insertAfer(ListNode previous,int data)
	{
		if(previous==null)
		{
			System.out.println("Thet given previous node cannot be null:");
			return;
		}
		ListNode newNode=new ListNode(data);
		newNode.next=previous.next;
		previous.next=newNode;
	}
	
	
	public ListNode insertAtEnd(ListNode head,int data)
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			return newNode;
		}
		ListNode current=head;
		while(null!=current.next)
		{
			current=current.next;
		}
		current.next=newNode;
		return head;
		
	}
	public ListNode insertAtBeginning(ListNode head,int data)
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			return newNode;
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	
	//given  a ListNode head,find out length of linked list;
	public int lenght(ListNode head)
	{
		if(head==null)
		{
			return 0;
		}
		//create a count variable to hold length
		int count=0;
		ListNode current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	public ListNode deleteFirst(ListNode head)
	{
		if(head==null)
		{
			return head;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	public ListNode deleteLast(ListNode head)
	{
		if(head==null)
		{
			return head;
		}
		ListNode last=head;
		ListNode previousToLast=null;
		while(last.next!=null)
		{
		    previousToLast=last;
		    last=last.next;
		}
		        previousToLast=null;
		        return last;
	}
	
	public ListNode deleteAtPosition(ListNode head,int position)
	{
		int size=lenght(head);
		if(position>size||position<1)
		{
			System.out.println("Invalid Position");
			return head;
		}
		if(position==1)
		{
			ListNode temp=head;
			head=head.next;
		    temp.next=null;
		    return temp;
		}
		else
		{
			ListNode previous=head;
			int count=1;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=current.next;
			current.next=null;
			return current;
		}
	}
	public boolean find(ListNode head,int searchKey)
	{
		if(head==null)
		{
			return false;
		}
		ListNode current=head;
		while(current!=null)
		{
			if(current.data==searchKey)
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
	*/
	public ListNode reverse(ListNode head)
	{
		if(head==null)
		{
			return head;
		}
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
	
	public static void main(String[] args)
	{
		//lets create a linked list
		//10--> 8---> 1----> 11--> null
		//10 as head node to linked list;
		ListNode head=new ListNode(10);
		ListNode second= new ListNode(8);
		ListNode third=new ListNode(1);
		ListNode fourth=new ListNode(11);
		
		//attach them together to form  a list
		head.next=second; //10-->8;
		second.next=third;//10--->8---->1;
		third.next=fourth;//10--->8----->1-----11;
		
		SingleLinkedList sgn=new SingleLinkedList();
		sgn.display(head);
		System.out.println();
		ListNode reverseListHead=sgn.reverse(head);
		sgn.display(reverseListHead);
		
		/*if(sgn.find(head, 1))
		{
			System.out.println("Search key found");
		}
		else
		{
			System.out.println("Search key not found");
		}*/
		
		/*ListNode specific=sgn.deleteAtPosition(head, 3);
		System.out.println(specific.data);*/
		
		/*ListNode Last=sgn.deleteLast(head);
		System.out.println(Last.data);*/
		
		/*ListNode first=sgn.deleteFirst(head);
		System.out.println(first.data);*/
		
		
		
		
	/*	sgn.insertAfer(second, 15);
		sgn.display(head);*/
		
		/*head=sgn.insertAtPosition(head, 15, 5);
		sgn.display(head);*/
		
		
	//	System.out.println("Lenght of linked list:"+sgn.lenght(head));
		
		/*ListNode newHead=sgn.insertAtBeginning(head, 15);
		sgn.display(newHead);*/
		
	/*	ListNode newHead1=sgn.insertAtEnd(head, 20);
		sgn.display(newHead1);*/
		
		
		
	}
	
	

}
