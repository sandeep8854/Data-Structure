
public class First
{
	public static void main(String[] args) 
	{
		long[] arr; //reference to array
		arr=new long[100]; //make array
		int nElems=0; //number of item
		int j; //loop conter
		//long searchkey; //key of item to serach for
		
		arr[0]=77;
		arr[1]=99;
		arr[2]=44;
		arr[3]=55;
		arr[4]=22;
		arr[5]=88;
		arr[6]=11;
		arr[7]=00;
		arr[8]=66;
		arr[9]=33;
		nElems=10;//now 10 item in Array
		
	 /*	for(j=0;j<nElems;j++)
		{
			System.out.println(arr[j]+ "");
		}
		System.out.println("");*/
		
	/*	int searchKey=44;
		for(j=0;j<nElems;j++)
			if(arr[j]==searchKey)
				break;
		if(j==nElems)
		{
			System.out.println("Can't find "+searchKey);
		}
		else
		{
			System.out.println("found "+searchKey);
		}*/
		int searchKey=55;
		for( j=0;j<nElems;j++)
			if(arr[j]==searchKey)
				break;
		for(int k=j;k<nElems-1;k++)
		{
			arr[k]=arr[k+1];
			nElems--;
		}
		//display item
		for(j=0;j<nElems;j++)
		{
			System.out.println(arr[j]+ " ");
		}
		System.out.println(" ");
		
	}


}
