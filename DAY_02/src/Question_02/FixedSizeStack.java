package Classwork;

public class FixedSizeStack implements Stack
{
	private int[] stackData; //Array to hold stack elements
	private int top; //Index of the top element 
	
	
	//Initialization of the constructor : Initializes the stack with a given capacity n 
	public FixedSizeStack(int n)
	{
		stackData = new int[n]; //Initialize array with specified size
		
		//Index of the top element , initialized to -1 (indicating the empty stack)
		top = -1 ; 
	}


	@Override
	public void push(int element) throws StackOverflowException
	{
		if(isFull())
		{
			throw new StackOverflowException("Stack is full , Cannot push(add) element.");
		}
		
		++top; //Move top index up
		
		stackData[top] = element; //Add element at the top
	}

	@Override
	public int pop() throws StackUnderflowException
	{
		if(isEmpty())
		{
			throw new StackUnderflowException("Stack is empty , cannot pop(remove) the element"); 
		}
						
		//Return the top element and decrease the top index
		return stackData[top--];
	}


	@Override
	public int peek() throws StackUnderflowException
	{
		if(isEmpty())
		{
			throw new StackUnderflowException("Stack is empty , cannot pop(remove) the element");
		}
		
		//Return the top element without modifying the stack
		return stackData[top];
	}


	@Override
	public boolean isEmpty() 
	{
		//The stack is empty if top is -1
		return top == -1;
	}


	@Override
	public boolean isFull() 
	{
		//The stack is full if top equals the last index
		return top == stackData.length - 1;
	}


	public void printStack() 
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return ;
		}
		
		System.out.println("Stack elements are: ");
		for(int i = 0; i <= top ; i++)
		{
			System.out.println(stackData[i]);
		}
	}		
}
