 class Reverse
{
	private String input;  //input string
	private String output;  //output String
	
	public Reverse(String in)
	{
		   input=in;
	}
	public String doRev()   //reverse the String
	{
		int stackSize=input.length();
		StackX1 theStack=new StackX1(stackSize);	//make stack
		
		for(int j=0;j<input.length();j++)
		{
			char ch=input.charAt(j);
			theStack.push(ch);
		}
		output="";
		while(!theStack.isEmpty())
		{
			char ch=theStack.pop();  //pop a char
			output=output+ch;   //append to output
		}
          return output;		
	}
}
