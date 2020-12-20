
public class MergeApp {
	public static void main(String[] args)
	{
		int[] arrayA = {23,47,81,95};
		int[] arrayB = {7,14,39,55,62,74};
		int[] arrayC = new int[10];
		
		merge(arrayA, 4,0,arrayB,6,0,arrayC,0);
		display(arrayC,10);	
	}

	private static void display(int[] theArray, int size) {
		for(int j=0; j<size;j++) {
			System.out.print(theArray[j] + "  ");
		}
		System.out.print(" ");
	}

	private static void merge(int[] arrayA, int sizeA,int aDex, int[] arrayB, int sizeB,int bDex, int[] arrayC,int cDex) 
	{
		//int aDex=0,bDex=0,cDex=0;
		while(aDex < sizeA && bDex < sizeB)  //neither array empty;
		{
			if(arrayA[aDex] < arrayB[bDex]) {
				arrayC[cDex++]=arrayA[aDex++];
			}else {
				  arrayC[cDex++] = arrayB[bDex++];
			}
		}
		while(aDex < sizeA)  //arrayB is empty
		{
			arrayC[cDex++]=arrayA[aDex++];
		}
		while(bDex < sizeB)  //arrayA is Empty
		{
			arrayC[cDex++]=arrayB[bDex++];
		}	
	}
}
