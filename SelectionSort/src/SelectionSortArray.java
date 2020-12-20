
public class SelectionSortArray
{
	public static void main(String[] args)
	{
		int maxSize=100;   //array size
		ArraySelection arr;      //reference to array
		arr=new ArraySelection(maxSize);  //create a array
		
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
		
//maintain only index value is called Selection sort.		
		
		arr.disply();
		
		arr.selectionSort();
		
		
		arr.disply();
		
		
	}

}
