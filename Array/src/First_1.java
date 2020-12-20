
public class First_1
{
	public static void main(String[] args)
	{
		int[] arr; //reference to array
		arr=new int[100]; //make a array
		int nElems=0;  //number of item
		//int searchKey; //key of item to search for
		int j;
		
		arr[0]=77;
		arr[1]=99;
		arr[2]=44;
		arr[3]=55;
		arr[4]=22;
		arr[5]=88;
		arr[6]=11;
		arr[7]=25;
		arr[8]=66;
		arr[9]=33;
		nElems=10;//now 10 item in array
		//display item int j used of loop counter
		/*for(j=0;j<nElems;j++)
			System.out.println(arr[j]+ " ");
		System.out.println(" ");
		System.out.println("<------------------->");*/
		
	/*	int searchKey=55;
		for(j=0;j<nElems;j++)
			if(arr[j]==searchKey)
				break;
		if(j==nElems)
			System.out.println("can't found "+searchKey);
		else
			System.out.println("found "+searchKey);*/
		//Delete the items
		
	int	searchKey=55;
	for(j=0;j<nElems;j++)
		if(arr[j]==searchKey)
			break;
	for(int k=j;k<nElems-1;k++)
		arr[k]=arr[k+1];
				nElems--;
				//display
				
				for(j=0;j<nElems;j++)
					System.out.println(arr[j]+" ");
				System.out.println(" ");		
		
	}
}
