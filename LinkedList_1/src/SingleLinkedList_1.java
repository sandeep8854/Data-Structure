import java.util.*;
public class SingleLinkedList_1
{
	//private ListNode head; //head node to hold the list
	
	
	//it contains a static inner class ListNode
	private static class ListNode
	{
		private int data;
		private ListNode next;
	
	public ListNode(int data)
	{
		this.data=data;
		this.next=next;
	}
}
	public void display(ListNode head)
	{
		if(head==null)
		{
			return;
		}
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+ "---->");
			current=current.next;
		}
		System.out.println(current);//here current will be null;
		
		
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
				
				head.next=second;  //10---->8
				second.next=third;  //10--->8----->1
				third.next=fourth; //10--->8------->1----->11
				
				SingleLinkedList_1 sll=new SingleLinkedList_1();
				sll.display(head);
	}
}
