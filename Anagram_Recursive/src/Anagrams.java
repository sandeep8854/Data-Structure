import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrams
{
static  int size;
static int count;
static char[] arrChar=new char[100];

public static void main(String[] args) throws IOException 
{
	System.out.println(" Enter a Word ");
	String san=getString();   //getString method 
	size=san.length();              //find its size;
	count =0;
	for(int j=0;j<size;j++)   //put it in array
		arrChar[j]=san.charAt(j);
	doAngram(size);  //anagram it;
}

private static void doAngram(int newSize)
{
	if(newSize==1)
		return;
	for(int j=0;j<newSize;j++)
	{
		doAngram(newSize-1); //anagram remainig
		if(newSize==2)   //if innermost
			displayWord();
		rotate(newSize);
	}
}
private static void rotate(int newSize)
{
	int j;
	int position=size-newSize;
	char temp=arrChar[position];  //save first latter
	for(j=position+1;j<size;j++)  //shift other left
		arrChar[j-1]=arrChar[j];
	arrChar[j-1]=temp;   //put first on right
}
private static void displayWord() 
{
	if(count<99) {
		System.out.println(" ");
	}
	if(count<9) {
		System.out.println(" ");
	}
	System.out.println(++count+ " ");
	for(int j=0;j<size;j++) {
		System.out.println(arrChar[j]);
	}
	System.out.println(" ");
	System.out.flush();
	if(count%6==0) {
		System.out.println(" ");
	}
	/*	System.out.println(" ");
	if(count < 9)
		System.out.println("  ");
	System.out.println(++count + " ");
	for(int j=0;j<size;j++)
		System.out.println(arrChar[j]);
	System.out.println(" ");
	System.out.flush();
	if(count % 6==0)
		System.out.println(" ");*/
}

private static String getString() throws IOException
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String sandeep=br.readLine();
	return sandeep;
 }
}
