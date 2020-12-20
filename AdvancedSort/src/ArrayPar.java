public class ArrayPar 
{
	private long[] theArray;  //reference to array theArray
	private int nElems;       //number of data item;
	
	public ArrayPar(int max) {
		theArray=new long[max];  //create the array
		nElems=0;               //no item yet;
	}
	
	public void insert(long value) {
		theArray[nElems]=value;  //insert it
		nElems++;                //increment size
	}
	
	private int size() {
		return nElems;
	}
	
	public void display()    //display array content
	{
		System.out.print("A = ");
		for(int j=0;j<nElems;j++) {
			System.out.print(theArray[j] + " ");
		}
		System.out.println(" ");
	}
	
	public int partitionIt(int left,int right,long pivot) {
		int leftPtr;
		int rightPtr;
		    leftPtr = left-1;
		    rightPtr = right+1;
		while(true)
		{
			while(leftPtr < right && theArray[++leftPtr]  < pivot)//find biggest item
				;  //(nop)
			while(rightPtr > left && theArray[--rightPtr] > pivot)//find smallest item
				;  //(nop)
			if(leftPtr >= rightPtr)  //if pointer cross
				break;             //partitiong done
			else
				swap(leftPtr,rightPtr);
		}
		return leftPtr;
	}

	private void swap(int x, int y) {
		long temp;
		temp=theArray[x];  //A into temp
		      theArray[x]=theArray[y];  //B into A
		      theArray[y]=temp;
	}
	public static void main(String[] args)
	{
		int maxSize=10;  //Array Size
		ArrayPar arr=new ArrayPar(maxSize);   //create the Array
		/*for(int j=0;j<maxSize;j++)     //fill array with
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
	//	arr.insert(63);
		/*arr.insert(188);
		arr.insert(16);
		arr.insert(150);
		arr.insert(44);
		arr.insert(169);*/
		arr.display();
		
		long pivot=77;  //pivot value
		System.out.println("Pivot is " + pivot);
		int size=arr.size();                           
		
		int partDex=arr.partitionIt(0, size-1, pivot);
		
		System.out.println(" Partition is at index " +partDex);
		arr.display();
	}
}


