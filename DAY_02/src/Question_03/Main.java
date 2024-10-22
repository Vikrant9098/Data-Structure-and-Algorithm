package Question_03;

public class Main 
{
	public static void main(String...stack)
	{
		try {
			//Create a new ArrayStack of Integers
			ArrayStack<Integer> stack1 = new ArrayStack<>();
			
			//Push elements onto the stack
			stack1.push(01);
			stack1.push(02);
			stack1.push(03);
			
			//Peek at the top element and print it 
			System.out.println("Top element is: " + stack1.peek()); 
			
			//Pop an element and print it 
			System.out.println("Popped element is: " + stack1.pop());
			System.out.println("Current size is: " + stack1.size());
			
			//Push more elements onto the stack
			stack1.push(4);
			stack1.push(5);
			stack1.push(6);
			
			//This should trigger resizing of the internal array
			stack1.push(7);
			
			//Pop an element and print it 
			System.out.println("Popped element is: " + stack1.pop());
		} 
		catch (StackemptyException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
