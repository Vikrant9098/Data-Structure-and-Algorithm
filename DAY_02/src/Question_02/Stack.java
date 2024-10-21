package Classwork;

public interface Stack
{
	void push(int element) throws StackOverflowException; //Adds an element to the top of the stack
	
	int pop() throws StackUnderflowException; //Removes and returns the top element of the stack
	
	int peek() throws StackUnderflowException; //Returns the top element without removing it 
	
	boolean isEmpty(); //Checks if the stack is empty
	
	boolean isFull(); //Check if the stack is full

}
