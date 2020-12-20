
public class Heap
{
	private Node[] heapArray;
	private int maxSize;         //size of array
	private int currentSize;     //number of node in array
	
	
	public Heap(int mx)  //constructor
	{
		maxSize=mx;
		currentSize=0;
		heapArray=new Node[maxSize];  //create array
	}
	
	public boolean isEmpty()
	{
		return currentSize==0;
	}
	
	public boolean insert(int key)
	{
		if(currentSize==maxSize)
			return false;
		
		Node newNode=new Node(key);  //make a new Node
		heapArray[currentSize]=newNode;//put it at the end
		trickleUp(currentSize++);      //trickle it Up
		return true;     //successs
	}

	private void trickleUp(int index)
	{
		int parent=(index-1)/2;
		Node bottom=heapArray[index];
		
		while(index > 0 && heapArray[parent].getKey() < bottom.getKey())
		{
			heapArray[index]=heapArray[parent];  //move node  down
			index=parent;                        //move index up
			parent=(parent-1)/2;                //parent <- its parent
		}
		heapArray[index] = bottom;
	}
	
	//////////    REMOVE the node   ///////////////////////////////////
	
	
	public Node remove()  //delete item with max key
	{                     //assume non empty list
		Node root=heapArray[0];  //save the root
		heapArray[0]=heapArray[--currentSize]; //root <- last
		
		trickleDown(0); //trickle down the root
		return root;    //return remove node
	}

	private void trickleDown(int index)
	{
		int largerChild;
		Node top=heapArray[index];  //save root
		while(index < currentSize/2) //while node has at
	    {                              //least one child
			int leftChild=2*index+1;
			int rightChild=leftChild+1;
			                             //find larger child
			
			if(rightChild < currentSize  &&   //right child exits
					heapArray[leftChild].getKey() < heapArray[rightChild].getKey())
				largerChild=rightChild;
			else
				largerChild=leftChild;
			                                          //top >= largerChild??
			if(top.getKey() >= heapArray[largerChild].getKey())
				break;
			
			heapArray[index]=heapArray[largerChild];   //shift child up
			index=largerChild;  //go down
		}
		heapArray[index]=top;    //root to index
	}
	
	
	public boolean change(int index,int newValue)
	{
		if(index < 0 || index >= currentSize)
			return false;
		int oldValue=heapArray[index].getKey();  //remember old
		heapArray[index].setKey(newValue);      //change to new
		
		
		if(oldValue < newValue)  //if raised
			trickleUp(index);    //trickle it up
		else                      //if lowered
			trickleDown(index);   //trickled it down
		return true;
	}
	
	
	public void displayHeap()
	{
		System.out.println("HeapArray: ");   //array format
		for(int m=0;m<currentSize;m++)
			if(heapArray[m] !=null)
				System.out.print(heapArray[m].getKey() + " ");
			else
				System.out.print("--");
		System.out.println(); 
		                        //heap format
		int nBlanks=32;
		int itemPerRow=1;
		int column=0;
		int j=0;                     //current item
		String dots=".............................";
		System.out.println(dots+dots);  //doted top line
		
		while(currentSize > 0)   //for each item
		{
			if(column==0)       //first item in row
				for(int k=0;k<nBlanks;k++)  //preceding blanks
					System.out.print(' ');
			                                    //display item
			System.out.print(heapArray[j].getKey());
			
			if(++j==currentSize)  //done
				break;
			
			if(++column==itemPerRow)   //end of row
			{
				nBlanks/=2;      //half the blanks
				itemPerRow*=2;    //twice the items
				column=0;         //start the over on
				System.out.println();    //new row
			}
			else
				for(int k=0;k<nBlanks*2-2;k++)
					System.out.print(' ');   //interim blanks
 		}
		System.out.println("\n"+dots+dots);  //dotted bottom line
	 }
	
	}
