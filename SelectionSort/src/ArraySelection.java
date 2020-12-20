
public class ArraySelection 
{
	private long[] a; //reference to array
	private int nElems;     //number of data item
	
	public ArraySelection(int max)
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
	public void selectionSort() 
	{
		int i;
		int j;
		int min;
		for(i=0;i<nElems-1;i++)
		{
			min=i;
			for(j=i+1;j<nElems;j++)
				if(a[j]<a[min])
					min=j;
			swap(i,min);
		}	
	}
	private void swap(int i, int min)
	{
		long temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
}
