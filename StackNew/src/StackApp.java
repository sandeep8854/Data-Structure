
public class StackApp
{
	public static void main(String[] args) 
	{
		StackX thestack=new StackX(10); //make a new stack
		thestack.push(20);
		thestack.push(40);
		thestack.push(60);
		thestack.push(80);
		thestack.push(100);
		thestack.push(120);
		thestack.push(140);
		thestack.push(160);
		thestack.push(180);
		thestack.push(2000);
		
		
		while(!thestack.isEmpty())
		{
			long value=thestack.pop();
			//thestack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}
