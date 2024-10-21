package Question_01;

//Queue using Array


//Making
public class ArrayQueue implements Queue 
{
	//Declaration of the Attributes
	private int[] elements; //Array that hold the queue elements
	private int front; //index of the front element
	private int rear; //index of the last element added
	private int capacity; //Maximum number of elements the queue can hold (Physical Size)
	private int size; //Current number of elements in the queue(Logical Size)
	
	
	//Constructor to initialize the queue with a specified capacity
	public ArrayQueue (int capacity)
	{
		this.capacity = capacity;
		this.elements = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	
	@Override
	public void enqueue(int element) 
	{
		//Checking the queue is full or not
		if(isFull())
		{
			throw new RuntimeException("Queue is Full"); //Raising the exception if the queue is full
		}
		
		//Increment the rear but but wrap around if it exceeds capacity
		rear = (rear + 1 ) % capacity; //Circular increment
		
		//Add the new element at the rear
		elements[rear] = element;
		
		//Increment the logical size of the queue
		size++;
		
	}

	@Override
	public int dequeue() 
	{
		//Checking the queue is empty or not
		if(isEmpty())
		{
			throw new RuntimeException("Queue is empty"); //Raise exception if empty
		}
		
		//Retrieve the front element
		int element = elements[front];
		
		//Increment the front index and wrap around
		front = (front+1) % capacity; //Circular increment
		
		//Decrement the logical size of the queue
		size--;
		
		return element;
	}

	@Override
	public boolean isEmpty() 
	{
		//Return true if size is zero(queue is empty)
		return size == 0 ; 
	}

	@Override
	public boolean isFull()
	{
		//Return true if size equals capacity(queue is full)
		return size == capacity;
	}
	
}

