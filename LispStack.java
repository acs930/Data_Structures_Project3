//Adam Smith

import java.util.Scanner;



public class LispStack {

  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		char b;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a valid Lisp equation");
		
		a = input.nextLine();
		
		//System.out.println(a);
		System.out.println(calculate(a));
		
		
	}
	
	
	public static int calculate(String equation)
	{
		char charNum = 0;
		int num = 0;
		int answer = 0;
		int numEquations = 1;
		int numArray[] = new int [equation.length()];
		char inp;
		
		ArrayStack<Character> newStack = new  ArrayStack(equation.length());
		
		for(int i = 0; i < equation.length(); i++)
		{
			newStack.push(equation.charAt(i));
			numArray[i] = 0;
		}
		
		/*for(int i = 0; i < equation.length(); i++)
		{
			System.out.println(newStack.pop());
		}*/
		
		for(int count = 0; count < equation.length(); count ++)
		{
			int i = 0;
			switch(newStack.peek())
			{
		
			case ')':

				newStack.pop();
				if((newStack.peek()) == ')')
				{
					newStack.pop();
					numEquations++;
				}
				while(((((num = inp = newStack.peek()))-48) > 0))
				{
					
					charNum = newStack.pop();
					 num = charNum - 48;
					 numArray[i] = num;
					 i++;

				}
					
				break;
			case '+':
				int sum = 0;
				newStack.pop();
				for(i = 0; i < numArray.length; i++)
				{
					if(numArray[i] != 0)
					{
						sum = numArray[i] + sum;
					}
					
				}
				answer = answer + sum;
				
				break;
			case '-':
				
				newStack.pop();
				int sub = numArray[0] * 2;
				for(i = 0; i < numArray.length; i++)
				{
					if(numArray[i] != 0)
					{
						sub = sub -numArray[i];
					}
					
				}
				answer = sub;
				break;
			case '*':			
				int mult = 1;
				newStack.pop();
				for(i = 0; i < numArray.length; i++)
				{
					if(numArray[i] != 0)
					{
						mult = numArray[i] * mult;
					}
					
				}
				answer = mult;
				
				break;
			case '/':
				
				newStack.pop();
				int div = numArray[0]*numArray[0];
				for(i = 0; i < numArray.length; i++)
				{
					if(numArray[i] != 0)
					{
						div = div/numArray[i];
					}
					
				}
				answer = div;
				
				break;
			case '(':
				for(i = 0; i < numArray.length; i++)
				{
					numArray[i] = 0;
				}
				if(numEquations > 0)
				{
					while(((((num = inp = newStack.peek()))-48) > 0))
					{
						
						charNum = newStack.pop();
						 System.out.println(num = charNum - 48);
						 numArray[i] = num;
						 i++;

					}
				}
				//answer = answer;

				
				break;
				
		}
		
		/*for(int ix = 0; i < numArray.length; i++)
		{
			System.out.println(numArray[i]);
		}*/
		//System.out.println(answer);
		}
	return answer;
	}
}


//ask user for a string
//ask user for input values
//put those values in a stack
//look for an operator
//do the operations by popping things off of the stack
//when stack is empty print out the final value

//create stack class/function that can do all necesary stack stuff
