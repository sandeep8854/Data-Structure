
public class ShellSortApp
{
	public static void main(String[] args)
	{
		int maxSize=5;
		ArraySh arr;
		arr=new ArraySh(maxSize);
		
		for(int j=0;j<maxSize;j++)
		{
			long n=(int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.shellSort();
		System.out.print("Sorted Array is:-");
		arr.display();
	}
}
