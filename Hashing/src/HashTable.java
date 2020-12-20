import java.util.*;
public class HashTable
{
	private DataItem[] hashArray;  //array hold HAsh table
	private int arraySize;
	private DataItem nonItem;  //for deleting item
	
	public HashTable(int size)   //constructor
	{
		arraySize=size;
		hashArray=new DataItem[arraySize];
		nonItem=new DataItem(-1);    //deleting item key is -1
	}
	
	
	public void displayTable()
	{
		System.out.println("Table: ");
		for(int j=0;j<arraySize;j++)
		{
			if(hashArray[j]!=null)
				System.out.println(hashArray[j].getKey()+" ");
			else
				System.out.println("** ");
		}
		System.out.println(" ");
	}
	
	public int hashFunc(int key)
	{
		return key % arraySize;    //hash function
	}
	
	public void insert(DataItem item)
	{
		int key=item.getKey();
		int hashVal=hashFunc(key);  //hash the key
		                              //until empty cell or -1
		while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1)
		{
			++hashVal;  //go to next cell
			hashVal=hashVal % arraySize;  //wrapRound if necessary
		}
		hashArray[hashVal]=item;  //insert item
	}
	public DataItem delete(int key)   //delete a data item
	{
		int hashVal=hashFunc(key);   //hash the key
		while(hashArray[hashVal]!=null)
		{
			if(hashArray[hashVal].getKey()==key)
			{
				DataItem temp=hashArray[hashVal];
				hashArray[hashVal]=nonItem;   //delete item
				return temp;
			}
			++hashVal;
			hashVal=hashVal%arraySize;
		}
		return null;
	}
	
	public DataItem find(int key)//find item with key
	{
		int hashVal=hashFunc(key);
		while(hashArray[hashVal]!=null)
		{
			if(hashArray[hashVal].getKey()==key)
				return hashArray[hashVal];  //yes ,return item
			++hashVal;
			hashVal=hashVal%arraySize;
		}
		return null;
	}
}
