
public class ArrayBub 
{
	private long[] a; //reference to array
	private int nElems;     //number of data item
	
	public ArrayBub(int max)
	{
		a=new long[max]; //create a array
		nElems=0;       //no item yet
	}
	

	public void insert(long value)
	{
		a[nElems]=value;  //insert it
		nElems++;
	}

	public void disply()
	{
		for(int j=0;j<nElems;j++)
			System.out.println(a[j] +" ");  //display it
		System.out.println(" ");
		
	}

	public void bubbleSort()
	{
		int i;
		int j;
		
		for(i=0;i<nElems-1;i++)  //backword
			for(j=0;j<nElems-1-i;j++)    //forword
		if(a[j]>a[j+1])             //out of order 
			swap(j,j+1);     //swap them
  	}
	private void swap(int one, int two)
	{
		long temp=a[one];
				a[one]=a[two];
						a[two]=temp;
	}
}
