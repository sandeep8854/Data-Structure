import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp 
{
	public static void main(String[] args) throws IOException
	{
		int value;
		Tree theTree=new Tree();
		theTree.insert(50, 1.5);
		theTree.insert(25, 1.2);
		theTree.insert(75, 1.7);
		theTree.insert(12, 1.5);
		theTree.insert(37, 1.6);
		theTree.insert(43, 1.7);
		theTree.insert(30, 1.2);
		theTree.insert(33, 1.4);
		theTree.insert(87, 1.7);
		theTree.insert(93, 1.5);
		theTree.insert(97, 1.5);
		
		while(true)
		{
			System.out.print("Enter First Letter Of Show: ");
			System.out.print("insert,find,delete,or traverse: ");
			int choice=getChar();
			switch(choice)
			{
			case 's':
				theTree.displayTree();
				break;
				
			case 'i':
				System.out.print("Enter value to insert: ");
				value=getInt();
				theTree.insert(value, value + 0.9);
				break;
				
			case 'f':
				System.out.print("Enter to value to find: ");
				value=getInt();
				Node found=theTree.find(value);
				if(found!=null)
				{
					System.out.print("Found: ");
					found.displayNode();
					System.out.print("\n");
				}
				else
					System.out.print("Cound Not Find: ");
				System.out.println(value +'n');
				break;
				
			case 'd':
				System.out.print("Enter value to delete: ");
				value=getInt();
				boolean didelete=theTree.delete(value);
				if(didelete)
					System.out.print("Delete " +value+ '\n');
				else
					System.out.print("Could Not Delete : ");
				System.out.print(value +'\n');
				break;
				
			case 't':
				System.out.print("Enter type 1,2 or 3 :");
				value=getInt();
				theTree.traverse(value);
				break;
				default :
					System.out.print("Invalid Entry \n");
			}  //end of switch
		}    //end while
	} //end main

	private static int getChar() throws IOException 
	{
		String s=getString();
		return s.charAt(0);
	}

	private static int getInt() throws IOException
	{
		String s=getString();
		return Integer.parseInt(s);
	}

	private static String getString() throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		return s;
	}
} //end class TreeApp










