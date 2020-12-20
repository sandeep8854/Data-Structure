
public class OrderedApp
{
	public static void main(String[] args)
	{
		int maxSize=100;
		//int nElems=0;
		OrdArray arr1;
		arr1=new OrdArray(maxSize);//create the array
		arr1.insert(77);
		arr1.insert(99);
		arr1.insert(44);
		arr1.insert(55);
		arr1.insert(22);
		arr1.insert(88);
		arr1.insert(11);
		arr1.insert(00);
		arr1.insert(66);
		arr1.insert(33);
//""""""""""""""""""""""""""""""""""""""""""""""""""		
		/*for(int z=0;z<nElems;z++)
			System.out.println(arr1[z]+ " ");
		System.out.println(" " );*/
//""""""""""""""""""""""""""""""""""""""""""""""""""""		
		int searchKey=55;//search for item
		if(arr1.find(searchKey)!=arr1.size())
			System.out.println("Found " +searchKey);
		else
			System.out.println("Can't Found " +searchKey);
		arr1.display();
	//"""'''''''""""""""""""""""""""""""""""""""""""""""""
		arr1.delete(00);
		arr1.delete(55);
		arr1.delete(99);
	//""""""""""""""""""""""""""""""""""""""""""""""""	
		arr1.display();
	//""""""""""""""""""""""""""""""""""""""""""""""""
	}

}
