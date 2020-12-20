import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp
{
	public static void main(String[] args) throws IOException
	{
		String input;
		String output;
		while(true)
		{
			System.out.println("Enter A String : ");
			System.out.flush();
			input=getString();   //read the String from KeyBoard
			if(input.equals(""))  //quit if [Enter]
				break;
			
			Reverse theReverse=new Reverse(input);
			output=theReverse.doRev();  //use it
			System.out.println( "Reversed : " +output);
		}
	}

	private static String getString() throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		return s;
	}
}
