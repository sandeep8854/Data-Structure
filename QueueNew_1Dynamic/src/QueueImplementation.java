import java.util.Scanner;

public class QueueImplementation
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Array Queue Test \n");
		System.out.println("Enter Size of Integer Queue: ");
		int n=scan.nextInt();
		ArrayQueue q=new ArrayQueue(n);
		
		char ch;
		do {
			System.out.println("\n Queue Operation : ");
			System.out.println("1.insert");
			System.out.println("2.remove");
			System.out.println("3.peek");
			System.out.println("4.CheckEmpty");
			System.out.println("5.CheckFull");
			System.out.println("6.Size ");
			
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Integer Element To insert");
				try
				{
					q.insert(scan.nextInt());
				}
				catch(Exception e)
				{
					System.out.println("Error: "+e.getMessage());
				}
				break;
			case 2:
				try
				{
					System.out.println("Removed Element: "+q.remove());
				}
				catch(Exception e)
				{
					System.out.println("Error : " +e.getMessage());
				}
				break;
			case 3:
				try
				{
					System.out.println("Peek Element " +q.peek());
				}
				catch(Exception e)
				{
					System.out.println("Error : "+e.getMessage());
				}
				break;
				
			case 4:
					System.out.println("Empty Status :"+q.isEmpty());
				break;
			case 5:
				System.out.println("Full Status :"+q.isFull());
				break;
			case 6:
				System.out.println("Size ="+q.getSize());
				break;
				default : System.out.println("Wrong Entity\n ");
				break;
			}
			//display queue
			q.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			 ch = scan.next().charAt(0);
		}while(ch=='Y' || ch=='y');
	}
}




















