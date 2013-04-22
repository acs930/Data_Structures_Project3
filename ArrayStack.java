//Adam Smith

import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<T>,                      
                           java.io.Serializable { 
   private T[] stack;   
   private int topIndex;   // index of top entry 

   public ArrayStack(int initialCapacity) { 
      stack = (T[]) new Object[initialCapacity]; 
      topIndex = -1; 
   }

   public void push(T newEntry) { 
      topIndex++; 
      if (topIndex >= stack.length)
         doubleArray(); 		// expand array 
      stack[topIndex] = newEntry; 
   } 

   private void doubleArray() {
		int newSize = (stack.length)*2;
		stack = Arrays.copyOf(stack, newSize);
	
}

public T pop(){ 
     T top = null; 
     if (!isEmpty ()) { 
	top = stack[topIndex]; 
       	stack[topIndex] = null; 
      	topIndex--; 
     }  
     return top;
   } 
   
   public T peek() { 
	  T top = null; 
	  // if (!isEmpty()) 
	      top = stack[topIndex]; 
	      return top; 
	   }
	  
  public boolean isEmpty(){ 
      return topIndex < 0; 
	   }

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		return null;
	}
	}
