
public class ArrayIns
{
	private long[] array; //reference to array
    private int nElems;     //number of data item

public ArrayIns(int max)
{
	array=new long[max]; //create a array
	nElems=0;       //no item yet
}


public void insert(long value)
{
	array[nElems]=value;  //insert it
	nElems++;
}

public void disply()
{
	for(int j=0;j<nElems;j++)
		System.out.print(array[j] +" ");  //display it
	System.out.println(" ");
	
}
	public void insertionSort() 
	{
		//int i;
		int j;
		for(int i=1;i<nElems;i++)
		{
			long key=array[i];
			j=i-1;
			while(j>=0 && array[j]>key)
			{
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
	}
}
