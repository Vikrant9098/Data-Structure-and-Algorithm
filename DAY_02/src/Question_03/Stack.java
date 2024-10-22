package Question_03;
/* Interface defining the basic operations of a Stack */

public interface Stack<T> 
{
	void push(T item); //Adds on item to the top of the stack
	
	T pop() throws StackemptyException; //Removes and returns the top item from the stack
	
	T peek() throws StackemptyException; //Returns the top item without removing it 
	
	boolean isEmpty(); //Checks if the stack is empty
	
	int size(); //Returns the number of elements in the stack

}

