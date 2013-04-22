import java.util.*;

public class Stacks {
  
	private int size;
	private int popNum;
	private int fromBack;
	private char theStack[];
	
	public Stacks()
	{
		size = 10;
		fromBack = 0;
		popNum = 0;
		theStack = new char[size];

	}
	
	public Stacks(int newSize)
	{
		size = newSize;
		fromBack = 0;
		popNum = 0;
		theStack = new char[size];

	}
	
	public int size()
	{
		return theStack.length;
	}
	
	public boolean isEmpty()
	{
		for(int i = 0; i < theStack.length; i++)
		{
			if(theStack[i] !=  (Character) null)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public char peek()
	{
		
		return theStack[theStack.length - (fromBack)];
		
	}
	
	public void push(char theElement)
	{
		theStack[theStack.length - (fromBack + 1)] = theElement;
		fromBack++;
		//System.out.println(fromBack);
	}

	public char pop() //with the first element being popped off first use from back else use popnum
	{
		char theElement = theStack[theStack.length - (fromBack+1)];
		fromBack--;
		return theElement;
		
	}

	public void expandArray()
	{
		int newSize = (theStack.length)*2;
		theStack = Arrays.copyOf(theStack, newSize);
	}
	
	public void clear()
	{
		for(int i = 0; i < theStack.length; i++)
		{
			theStack[i] = (Character) null;
		}
		size = 0;
	}

}
