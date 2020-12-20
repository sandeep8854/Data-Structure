
public class ClassDataArray
{
	private Person[] a;  //reference to array
	private int nElems;  //number of data items
	
	public ClassDataArray(int max)//constuctor
	{
		a=new Person[max];  //create the array
		nElems=0;           //no item yet
	}   
	public Person find(String searchName)
	{
		int j;
		for(j=0;j<nElems;j++)
			if(a[j].getLast().equals(searchName))//found item
				break;
		if(j==nElems)
			return null;//can't find it
		else
			return a[j];//no find it
	}
	public void insert(String last,String first,int age)
	{
		a[nElems]=new Person(last,first,age);
		nElems++;
	}
	public boolean delete(String searchName)
	{
		int j;
		for(j=0;j<nElems;j++)
			if(a[j].getLast().equals(searchName))
				break;
		if(j==nElems)
			return false;
		else
		{
			for(int k=j;k<nElems;k++)
				a[k]=a[k+1];
			nElems--;
			return true;
		}
	}
	public void display()
	{
		for(int j=0;j<nElems;j++)
		 a[j].displayPerson();
	}
}
