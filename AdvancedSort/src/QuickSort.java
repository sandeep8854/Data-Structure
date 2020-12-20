public class QuickSort 
{
	private long[] theArray;  //reference to array theArray
	private int nElems;       //number of data item;
	
	public QuickSort(int max) {
		theArray=new long[max];  //create the array
		nElems=0;               //no item yet;
	}
	
	public void insert(long value) {
		theArray[nElems]=value;  //insert it
		nElems++;                //increment size
	}
	
	public void display()    //display array content
	{
		System.out.print("A = ");
		for(int j=0;j<nElems;j++) {
			System.out.print(theArray[j] + " ");
		}
		System.out.println(" ");
	}
	
	public void quick_Sort()
	{
		recQuickSort(0, nElems-1 );
	}

	private void recQuickSort(int left, int right)
	{
		if(right-left <= 0)  //if size <=1
			return;  //already sorted
		else
		{
			long pivot=theArray[right];   //right most item
			                               //partition range
			int partition=partitionIt(left,right,pivot);
			recQuickSort(left, partition-1);  //sort left side
			recQuickSort(partition+1 , right); //sort right side
		}
	}

	private int partitionIt(int left, int right, long pivot) {
		
		int leftPtr;
		int rightPtr;
		    leftPtr = left-1;      //left (after++)
		    rightPtr = right;    //right-1(after--)
		while(true)
		{
			while(leftPtr < right && theArray[++leftPtr]  < pivot)//find biggest item
				;  //(nop)
			while(rightPtr > left && theArray[--rightPtr] > pivot)//find smallest item
				;  //(nop)
			if(leftPtr >= rightPtr)  //if pointer cross
				break;             //partitiong done
			else
				swap(leftPtr,rightPtr);  //swap element
		}
		swap(leftPtr,right);   //restore pivot
		return leftPtr;
	}

	private void swap(int x, int y)
	{
		long temp;
		temp=theArray[x];  //A into temp
		      theArray[x]=theArray[y];  //B into A
		      theArray[y]=temp;
	}
	
	public static void main(String[] args)
	{
		int maxSize=10;  //Array Size
		QuickSort arr=new QuickSort(maxSize);   //create the Array
	/*	for(int j=0;j<maxSize;j++)     //fill array with
		{
			long number=(int)(java.lang.Math.random()*199);
			arr.insert(number);
		}*/
		
		arr.insert(187);
		arr.insert(121);
		arr.insert(103);
		arr.insert(43);
		arr.insert(126);
		arr.insert(55);
		arr.insert(95);
		arr.insert(8);
		arr.insert(115);
		arr.insert(117);
		
		arr.display();
		arr.quick_Sort();
		arr.display();
		
	}
}
	
	



















