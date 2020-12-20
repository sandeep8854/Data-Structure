public class ListInsertedSortApp 
{
	public static void main(String[] args) 
	{
		int size=10;
		Link[] theArray=new Link[size];
		for(int j=0;j<size;j++)
		{
			int n=(int)(java.lang.Math.random()*99);
			Link newLink=new Link(n);//new Link
			theArray[j]=newLink;   //put in array
		}
		System.out.print(" Unsorted Array :");
		for(int i=0;i<size;i++)
		{
			System.out.print(theArray[i].dData + " ");
		}
		System.out.println(" ");
		
		SortedList theSortedList=new SortedList(theArray);
		for(int jj=0;jj<size;jj++)
		{
			theArray[jj]=theSortedList;
		}
		System.out.println(" Sorted Array: ");
		for(int iii=0;iii<size;iii++)
			System.out.println(theArray[iii].dData + " ");
		System.out.println("");
		
	}

}
