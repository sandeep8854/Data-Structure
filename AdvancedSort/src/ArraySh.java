
public class ArraySh 
{
	private long[] theArray;  //reference to array theArray
	private int nElems;       //number of data item;
	
	public ArraySh(int max) {
		theArray=new long[max];
		nElems=0;   //no item yet
	}
	public void insert(long value)   //put element into array
	{
		theArray[nElems]=value;  //insert it
		nElems++;
	}
	public void display() 
	{    //display array content
		System.out.print("A = ");
		for(int j=0;j<nElems;j++)
		{
			System.out.print(theArray[j] + " ");  //diplay it;
		}
		System.out.println(" ");		
	}
	
	public void shellSort()
	{
		int inner,outer;
		long temp;
		int h=1;   //find inintial value of h;
		while(h <= nElems/3)
			h=h*3+1; //(1,4,13,40,121,......)
		
		while(h>0)  //decreaging h until h=1;
		{
			for(outer=h;outer<nElems;outer++)
			{
				temp=theArray[outer];
				inner=outer;
				
				while(inner>h-1 && theArray[inner-h] >= temp)
				{
					theArray[inner] = theArray[inner-h];
					inner=inner-h;
				}
				theArray[inner] = temp;
			}
			h=(h-1)/3;
		}
	}
	
	public static void main(String[] args)
	{
		int maxSize=5;
		ArraySh arr=new ArraySh(maxSize);  //create the Array
		for(int j=0;j<maxSize;j++)
		{
			long n=(int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display();   //display unsorted array
		arr.shellSort();   //shell sort the array
		arr.display();	   //display sorted array
	}
}
