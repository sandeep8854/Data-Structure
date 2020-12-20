import java.util.*;
public class DoublyLinkedList
{
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode
	{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data)
		{
			this.data=data;
		}
	}

	
	public DoublyLinkedList()
	{
		this.head=head;
		this.tail=tail;
		this.length=length;
	}
	public boolean isEmpty()
	{
		return length==0; //head==null
	}
	public int length()
	{
		return length;
	}
	public void displayForword()
	{
		if(head==null)
		{
			return;
		}
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+ "--->>");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public void displayBackword()
	{
		if(head==null)
		{
			return;
		}
		ListNode temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+ "----<<<<");
			temp=temp.previous;
		}
		System.out.println("null");	
	}
	public void insertFirst(int value)
	{
		ListNode newNode=new ListNode(value);
		if(isEmpty())
		{
			tail=newNode;
		}
		else
		{
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
	/*public void insertElement(int value)
	{
		ListNode newNode=new ListNode(value);
		if(isEmpty())
		{
			head=newNode;
		}
		else
		{
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
	}*/
	public void insertAtEnd(int value)
	{
		ListNode newNode=new ListNode(value);
		if(isEmpty())
		{
		head=newNode;
		}
		else
		{
			tail.next=newNode;
			newNode.previous=tail;
		}
		      tail=newNode;
		      length++;
	}
	public ListNode deleteFirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		ListNode temp=head;
		if(head==tail)
		{
			tail=null;
		}
		else
		{
			head.next.previous=null;
		}
		head=head.next;
		temp.next=null;
		tail=null;
		length--;
		return temp;
	}
	public ListNode deleteLast()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		
		
		ListNode temp=tail;
		if(tail==head)
		{
			head=null;
		}
		else
		{
			
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
		length--;
		return temp;
	}
	public static void main(String[] args)
	{
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.insertAtEnd(1);
		dll.insertAtEnd(10);
		dll.insertAtEnd(15);
		dll.displayForword();
		dll.deleteLast();
	dll.displayForword();
		/*dll.deleteLast();
		dll.displayForword();
		dll.deleteLast();
		dll.displayForword();
		dll.deleteLast();
		dll.displayForword();
		
		
		
		//dll.displayBackword();	*/
	}
}
