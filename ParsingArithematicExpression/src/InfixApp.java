import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixApp 
{
	public static void main(String[] args) throws IOException
	{
		String input;
		String output;
		while(true)
		{
			System.out.println(" Enter infix:  ");
			System.out.flush();
			input =getString();  //read a string from kbd
			if(input.equals("") )
				break;
			               //make a translator
			INToPost theTrans= new INToPost(input);
			output= theTrans.doTrans();  //do the translation
			System.out.println("Postfix is " +output + '\n');
		}
	}

	private static String getString() throws IOException 
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		String s=br.readLine();
		return s;
	}

}
