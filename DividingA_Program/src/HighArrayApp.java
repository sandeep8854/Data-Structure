
public class HighArrayApp 
{
	public static void main(String[] args)
	{
		int maxSize=100;//size the array
		HighArray arr;//reference the array
		arr=new HighArray(maxSize);//create the array
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(101);
		
		//""""""""""""""""""""""""""""""""""""""""""
		arr.dislpay();
		//"""""""""""""""""""""""""""""""""""""""""""
		int searchKey=35;
		if(arr.find(searchKey))
			System.out.println("Found "+searchKey);
		else
			System.out.println("can't found "+searchKey);
		
		arr.delete(00);
		arr.delete(55);
		arr.delete(99);
		//""""""""""""""""""""""""""""""""""""""""""""""""""
		arr.dislpay();
		//""""""""""""""""""""""""""""""""""""""""""""""""""""""
	}

}
