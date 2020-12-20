
public class OrdArray
{
	private long[] arr;//reference to array array
	private int nElems;//number of data items
	
	public OrdArray(int max)
	{
		arr=new long[max];
		nElems=0;
	}
	public int size()
	{
		return nElems;
	}
	
	public int find(long searchKey)
	{
		int lowerBound=0;
		int upperBound=nElems-1;
		int curIn;
		while(true)
		{
			curIn=(lowerBound+upperBound)/2;
					if(arr[curIn]==searchKey)
						return curIn;//found it.
					else if(lowerBound>upperBound)
						return nElems;//can't find it.
					else                     //divide range
					{                           
						if(arr[curIn]<searchKey)
							lowerBound=curIn+1;//it's in upper half
						else
							upperBound=curIn-1;
					}
		}
	}
	public void insert(int value)//put element in to array
	{
		int j;
		for(j=0;j<nElems;j++)
			if(arr[j]>value)
				break;
		for(int k=nElems;k>j;k--)//move bigger ones up
			arr[k]=arr[k-1];
		arr[j]=value;
		nElems++;
	}
	public boolean delete(int value1)
	{
		int j=find(value1);
		if(j==nElems)
			return false;//can't find
		else
		{
			for(int k=j;k<nElems;k++)//move bigger once down
				arr[k]=arr[k+1];
			nElems--;
			return true;
		}
	}
	public void display() 
	{
		for(int j=0;j<nElems;j++)
			System.out.println(arr[j]+ " ");
				System.out.println(" ");
	}
}
