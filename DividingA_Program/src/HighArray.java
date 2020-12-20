public class HighArray 
{
	private long[] arr1;//reference array
	private int nElems;//number of data item
	
	public HighArray(int max)
	{
		arr1=new long[max];//create the array
		nElems=0;
	}
	public boolean find(long searchKEey)
	{                                 //find Specific values
		int j;
		for(j=0;j<nElems;j++)
			if(arr1[j]==searchKEey)//find item
				break;
		if(j==nElems)
		return false;
		else
			return true;
	}
	//""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
		public boolean delete(long value)
		{
			int j;
			for(j=0;j<nElems;j++)
				if(value==arr1[j])
					break;
			if(j==nElems)
				return false;
			else
			{
				for(int k=j;k<nElems;k++)
					arr1[k]=arr1[k+1];
				nElems--;
				return true;
			}
		}		
	//""""""""""""""""""""""""""""""""""""""""""""""""""
	public void insert(int i)
	{
		arr1[nElems]=i;
		nElems++;
	}
	//""""""""""""""""""""""""""""""""""""""""""""""""
	public void dislpay()
	{
	for(int j=0;j<nElems;j++)
		System.out.println(arr1[j]+ " " );
	System.out.println(" ");		
	}
}
