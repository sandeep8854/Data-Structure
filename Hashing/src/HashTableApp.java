import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class HashTableApp 
{
	public static void main(String[] args) throws IOException
	{
		DataItem aDataItem;
		int akey;
		int size;
		int n;
		int keysPerCell;
		System.out.println("Enter Size of Hash Table: ");
		size=getInt();
		System.out.println("Enter Initial number of item: ");
		n=getInt();
		keysPerCell=10;
		
		HashTable theHashTable=new HashTable(size);
		for(int j=0;j<n;j++)
		{
			akey=(int)(java.lang.Math.random()*keysPerCell*size);
			aDataItem=new DataItem(akey);
			theHashTable.insert(aDataItem);
		}
		while(true)
		{
			System.out.print("Enter first latter of: ");
			//System.out.print(" Show,insert,delete,or find:");
			System.out.print("S- Show,");
			System.out.print("I-Insert,");
		   System.out.print("D-Delete,");
		   System.out.print("F-find");
			char choice=getChar();
			switch(choice)
			{
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.println("Enter key value to insert:");
				akey=getInt();
				aDataItem=new DataItem(akey);
				theHashTable.insert(aDataItem);
				break;
			case 'd':
				System.out.println("Enter key value to delete: ");
				akey=getInt();
				theHashTable.delete(akey);
				break;
			case 'f':
				System.out.println("Enter key value to find: ");
				akey=getInt();
				aDataItem=theHashTable.find(akey);
				if(aDataItem!=null)
				{
					System.out.println("Found "+akey);
				}
				else
					System.out.println("Could not found "+akey);
				break;
				default:
				System.out.println("Invalid Entry\n");
			}
		}
		
	}

	private static char getChar() throws IOException 
	{
		String s=getString();
		return s.charAt(0);
	}

	private static String getString() throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		return s;
	}

	private static int getInt() throws IOException 
	{
		String s=getString();
		return Integer.parseInt(s);
	}
}
