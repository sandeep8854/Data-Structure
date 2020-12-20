public class ArraySh
{
	private long[] theArray;
	private int nElems;
	
	public ArraySh(int max)
	{
		theArray=new long[max];   //create the array
		nElems=0;                 //no item yet;
	}
	public void insert(long value)  //put item in to array
	{
		theArray[nElems]=value;
		nElems++;
	}
	public void display()
	{
		System.out.print("A=");
		for(int j=0;j<nElems;j++)
		{
			System.out.print(theArray[j]+ " ");
		}
		System.out.println(" ");
	}
	
	public void shellSort()
	{
		int inner,outer;
		long temp;
		
		int h=1;
		while(h<=nElems/3)
			h=h*3+1;
		
		while(h>0)
		{
			for(outer=h;outer<nElems;outer++)
			{
				temp=theArray[outer];
				inner=outer;
				while(inner>h-1 && theArray[inner-h]>=temp)
				{
					//long[] theAarry = null;//check this point
					theArray[inner]=theArray[inner-h];
					inner=inner-h;
				}
				theArray[inner]=temp;
			}
			h=(h-1)/3;   //decrease h
		}
	}
}