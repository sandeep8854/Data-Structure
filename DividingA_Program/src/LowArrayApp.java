
public class LowArrayApp 
{
	public static void main(String[] args)
	{
		LowArray arr;//reference array
		arr=new LowArray(100);//create low array object
		int nElems=0;//number of item in array
				int j;//loop variable
				arr.setElem(0,77);
				arr.setElem(1,99);
				arr.setElem(2,44);
				arr.setElem(3,55);
				arr.setElem(4,22);
				arr.setElem(5,88);
				arr.setElem(6,11);
				arr.setElem(7,00);
				arr.setElem(8,66);
				arr.setElem(9,33);
				nElems=10;//now 10 item in array
				for(j=0;j<nElems;j++)
					System.out.println(arr.getElem(j)+ " ");
				System.out.println(" ");
				
				int searchKey=26;
				for(j=0;j<nElems;j++)
					if(arr.getElem(j)==searchKey)
						break;
				if(j==nElems)
					System.out.println("can't found "+searchKey);
				else
					System.out.println("found" +searchKey);
				
				//delete 55
				for(j=0;j<nElems;j++)
					if(arr.getElem(j)==55)
						break;
				for(int k=j;k<nElems;k++)
					arr.setElem(k, arr.getElem(k+1));
				nElems--;
				//display the array
				for(j=0;j<nElems;j++)
					System.out.println(arr.getElem(j)+ " ");
				System.out.println(" ");
	}

}
