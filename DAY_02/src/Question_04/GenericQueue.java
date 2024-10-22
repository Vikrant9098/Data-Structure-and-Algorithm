package Question_04;

public class GenericQueue <T> implements Queue<T>
{
	//Declaration of the Attributes
	private T[] array; //Array to hold the queue elements
	private int front; //Index of the front element
	private int rear; //Index of the rear element
	private int capacity; //Maximum number of the elements in the queue i.e. Physical size
	private int count; //Current number of the elements in the queue i.e. Logical Size
	
	//Initialization and Declaration of the Constructor
	@SuppressWarnings("unchecked")
	public GenericQueue(int size)
	{
		this.capacity = size; //Set the capacity of the queue
		this.array = (T[]) new Object[size]; //Create the array to hold elements
		this.front = 0; //Initialize front index
		this.rear = -1; //Initialize rear index
		this.count = 0; //Initialize the logical size to zero
	}
	
	
	//Enqueue: Adding the item to the rear of the queue
	@Override
	public void enqueue(T item) throws QueuefullException 
	{
		if(isFull())
		{
			throw new QueuefullException("Stack is Full");
		}
		
		rear = (rear + 1 ) % capacity; //Circular increment of rear index
		
		array[rear] = item;  //Adding the element in the queue
		
		count++; //Increment the count of elements
	}
	
	//Dequeue: Removing the item from the front and printing it from the queue
	@Override
	public T dequeue() throws QueueemptyException 
	{
		if(isEmpty())
		{
			throw new QueueemptyException("Stack is Empty");
		}
		
		T item = array[front]; //Get the item from the front
		
		front = (front + 1) % capacity; //Circular increment of front index
		
		count--;
		
		return item;
	}
	
	//Check if the queue is empty or not
	@Override
	public boolean isEmpty() 
	{
		return count == 0 ; //Return true if count is zero
	}
	
	//Check if the queue is full or not
	@Override
	public boolean isFull()
	{
		return count  == capacity; //Return true if the count equals capacity
	}
	
	//Get the current size of the queue i.e Logical Size
	@Override
	public int size() 
	{
		return count; //Return the current number of element in the queue i.e. Logical size
	}
}
