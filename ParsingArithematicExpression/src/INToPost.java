
public class INToPost  //infix to postfix conversion 
{
	private StackX theStack;
	private String input;
	private String output=" ";
	
	public INToPost(String n )  //constructor
	{
		input=n;
		int stackSize=input.length();
		theStack=new StackX(stackSize);
	}
	
	public String doTrans()  //do translation to postfix
	{
		for(int j=0;j<input.length();j++)
		{
			char ch=input.charAt(j);
			theStack.displayStack("For "+ch+ " ");  //diagnostic
			switch(ch)
			{
			case '+':  //it's + or -
			case '-':
				gotOper(ch,1);  //go pop oeration
				break;          //(precedence 1)
				
			case '*':  //it's * or /
			case '/':
				gotOper(ch,2);  //go pop operation
				break;   //(precedence)
				
			case '(':                //it's a left parenthisis
				theStack.push(ch);   //push it
				break;
				
			case ')':          //it's right parenthisis
				gotParen(ch);   //go pop operation
				break;
				
				default:                 //must be an operand
					output=output+ch;    //right to be output
					break;
			}  // end switch
		}      //end for
		
		while(!theStack.isEmpty())  //pop remaining operation
		{
			theStack.displayStack("While");   //diagnostic
			output=output + theStack.pop();   //write to output
		}
		theStack.displayStack("End  ");      //diagnostic
		
		return output;                      //return postfix	
	}

	private void gotOper(char opThis, int prec1)
	{                                        //got operator from input
		while(!theStack.isEmpty())
		{
			char opTop=theStack.pop();
			if(opTop == '(' )          //if it is '('
			{
				theStack.push(opTop);  //restore '('
				break;
			}
			else                    //it not operator
			{
				int prec2 =0;    //precedence of new output
				if(opTop == '+' || opTop == '-')  //find new op prec
					prec2=2;
				if(prec2 < prec1)  //if prec of new op less
				{                    //than prec of old
					theStack.push(opTop);   //save newly popped op
					break;
				}
				else               //prec of new not less
					output = output + opTop;  //than prec of old
			}
		}
		theStack.push(opThis);  //push new operator
	}
	
	private void gotParen(char ch)
	{            //got right paren from input
		while(!theStack.isEmpty())
		{
			char chx=theStack.pop();
			if(chx == '(') //if popped '('
			break;           //we are done
			else            //if popped operation
				output=output+chx; //output it
		}
	}
}