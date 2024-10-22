package Question_03;

//Implementation of a stack using a resizable array
@SuppressWarnings("unchecked")
public class ArrayStack<T> implements Stack<T>
{
	//Attributes declaration
	private T[] array; //Array to hold stack elements
	private int capacity; //Current capacity of the stack i.e Physical size
	private int size; //Current number of elements in the stack i.e Logical size

	//Constructor declaration
	@SuppressWarnings("unchecked")
	public ArrayStack()
	{
		capacity = 5 ; //Initial capacity of the stack
		array = (T[]) new Object [capacity]; //Create the internal array
		size = 0; //Initialize the size of the stack
	}

	//Push an item onto the stack
	@Override
	public void push(T item)  
	{
		if(size == capacity)
		{
			//Check if the array needs to be resized
			System.out.println("Resizing the array , new element beyond the actual size is added !!");
			resize(2 * capacity); //Double the capacity
		}
		
		array[size] = item; //Add the item and increment the size
		
		size++;
	}

	//Pop an item from the stack
	@Override
	public T pop() throws StackemptyException 
	{
		if(isEmpty())
		{
			throw new StackemptyException("Stack is empty"); //Throw exception if stack is empty
		}
		
		size--;
		T item = array[size]; //Retrieve the top item and decrement the size
		
		
		
		array[size] = null; //Avoid Loitering (help with garbage collection) i.e avoid memory leaks
		
		
		//Shrink the array if the size is one-quarter of the capacity
		if(size > 0 && size == capacity / 4)
		{
			resize(capacity / 2);
		}
		
		return item; //Return the popped item
		
	}

	//Peek at the top item without removing it 
	@Override
	public T peek() throws StackemptyException 
	{
		if(isEmpty())
		{
			throw new StackemptyException("Stack is Empty");
		}
		
		return array[size-1] ; //Return the top item
	}

	@Override
	public boolean isEmpty() 
	{
		return size == 0; //Return true if the stack is empty
	}

	@Override
	public int size() 
	{
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public void resize(int newCapacity)
	{
		T[] newArray = (T[]) new Object [newCapacity]; //Create a new array with the new capacity
		System.arraycopy(array, 0, newArray, 0, size); //copy elements to the new array
		
		array = newArray; //Reassign the reference to the new array
		
		capacity = newCapacity; //Update the capacity to the new size
	}
	
	
	
}
