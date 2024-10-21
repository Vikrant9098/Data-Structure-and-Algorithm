package Classwork;

public class Main
{
	public static void main(String...day02)
	{
		//Create a stack with a size of 3
		FixedSizeStack stack = new FixedSizeStack(3);
		
		
		try {
				//Pushing the elements into the stack using the push function
				stack.push(10);
				stack.push(20);
				stack.push(30);
				
				//Printing the stack
				stack.printStack();
				
				//Printing the elements into the stack using the peek function
				System.out.println("Top element is: " + stack.peek());
				
				//this will through the exception that the stack is full
				stack.push(40);
			} 
		
		catch (StackOverflowException | StackUnderflowException e ) 
			{
				System.out.println(e.getMessage());;
			} 
		
		
		try {
				//Removing the elements form the stack using the pop function
				stack.pop();
				stack.pop();
				stack.pop();
				
				//This will throw the StackUnderflowException
				stack.pop();
		    } 
		
		catch (StackUnderflowException e) 
			{
				System.out.println(e.getMessage());
			}
		
	}

}
