
public class LowArray
{
	private long[] a;//reference to array a
	public LowArray(int size)//constructor
	{
		a=new long[size];
	}
	public void setElem(int index,long value)//set value
	{
		a[index]=value;
	}
	public long getElem(int index)//get value
	{
		return a[index];
	}
}
