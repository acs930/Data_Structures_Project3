import java.util.Arrays;


public class MyStackArray<E>{

  private int size = 0;
	private Object elements[];
	
	public MyStackArray()
	{
		elements = new Object[10];
	}
	
	public MyStackArray( int sizeAr)
	{
		size = sizeAr;
		elements = new Object[size];
	}
	
	public int size() {
		
		return elements.length;
	}
	public boolean isEmpty() { //checks to see if elements in array are null
	
		for(int i = 0; i<elements.length; i++)
		{
			if(elements[i] != null)
			{
				return false;
			}
		}
		
		return true;
		
	}
	public Object peek() {
		
		return elements[elements.length - size];
	}
	public void push(E element) {
		if(size == elements.length)  //checks if array needs to be expanded puts the element in the next slot in array
		{
			expandArray();
		}
		
		elements[elements.length - size] = element;
		size++;
		
	}
	public E pop() 
	{
		E element = (E) elements[elements.length - size];
		size--;
		return element;
		
	}

	public void expandArray()
	{
		int newSize = (elements.length)*2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public void clear()
	{
		for(int i = 0; i < elements.length; i++)
		{
			elements[i] = null;
		}
		size = 0;
	}



}
