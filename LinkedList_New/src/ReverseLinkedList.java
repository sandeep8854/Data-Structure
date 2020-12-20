public class ReverseLinkedList
{
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int dd)
		{
			this.data=dd;
			this.next=null;
		}
	}
	
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
	
	public void display(ListNode head)
	{
		if(head==null)
		{
			return;
		}
		
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println(current);//here current will be null;
	}
	
	public static void main(String[] args) 
	{
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(9);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(7);
		ListNode fifth=new ListNode(6);
		
		head.next=second;  //10--->9
		second.next=third; //10-->9--->8
		third.next=fourth; //10-->9-->8--->7
		fourth.next=fifth;  //10-->9-->8--->7--->6
		
		ReverseLinkedList srll=new ReverseLinkedList();
		srll.display(head);
		System.out.println();
		
		ListNode reverseListNode=srll.reverse(head);
		srll.display(reverseListNode);	
	}
}



































