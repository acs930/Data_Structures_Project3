import java.util.Scanner;



public class main {

  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		char b;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a valid Lisp equation");
		
		a = input.nextLine();
		
		//System.out.println(a);
		calculate(a);
		
	}
	
	
	public static int calculate(String equation)
	{
		char charNum = 0;
		int num = 0;
		int answer = 0;
		int numArray[] = new int [equation.length() +2];
		
		Stacks newStack = new Stacks(equation.length());
		
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
				System.out.println(newStack.pop());
				while((newStack.peek() != '+' ) ||(newStack.peek() != '-' ) ||(newStack.peek() != '*' ) ||(newStack.peek() != '/' ) ||(newStack.peek() != '(' ))
				{
					System.out.println(charNum = newStack.pop());
					 num = charNum - 48;
					 numArray[i] = num;
					 i++;
				}
				break;
			/*case '+':
				int sum = 0;
				newStack.pop();
				for(i = 0; i < numArray.length; i++)
				{
					if(numArray[i] != 0)
					{
						sum = numArray[i] + sum;
					}
					
				}
				answer = sum;
				
				break;
			/*case '-':
				
				break;
			case '*':
				
				break;
			case '/':
				
				break;*/
			case '(':
				answer = answer;
				
				break;
			
				
			}	
		}
		
		for(int i = 0; i < numArray.length; i++)
		{
			System.out.println(numArray[i]);
		}
		//System.out.println(num);
		return answer;
	}

}
//ask user for a string
//ask user for input values
//put those values in a stack
//look for an operator
//do the operations by popping things off of the stack
//when stack is empty print out the final value
//parenthesis seperate problems they are neccessary the first value must be an open paren
// first entry ) last entry (b

//create stack class/function that can do all necesary stack stuff
