
public class BubbleSortArray
{
	public static void main(String[] args)
	{
		int maxSize=100;   //array size
		ArrayBub arr;      //reference to array
		arr=new ArrayBub(maxSize);  //create a array
		
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
		
		
		
		arr.disply();
		
		arr.bubbleSort();
		
		
		arr.disply();
		
	}

}
