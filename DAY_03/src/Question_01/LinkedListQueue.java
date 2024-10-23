package Question_01;

public class LinkedListQueue implements Queue
{
	//Declaration of the Attributes
	private Node front; //Front pointer for the queue
	private Node rear; //Rear pointer for the queue
	private int size; //Number of elements in the queue
	
	//Constructor to initialize the queue
	public LinkedListQueue()
	{
		front = null; //front are null(empty null)
		rear = null; //rear is also null (empty null)
		size = 0; //size is initially 0
	}

	//Enqueue : Adds an element to the end of the queue
	@Override
	public void enqueue(int element) 
	{
		//Create a new node with the given data
		Node newNode = new Node(element);
		
		if(rear == null)
		{
			//If queue is empty , front and rear will both point to the new node
			front = rear = newNode;
		}
		else
		{
			//If queue is not empty, link the new node to the current rear
			rear.next = newNode;
			rear = newNode; //Move the rear to the new node
		}
		
		size++; //Increase the size of the queue
		
		System.out.println("Enqueued: " + element);
	}

	//Dequeue: Removes and returns the front element of the queue
	@Override
	public int dequeue() throws QueueemptyException 
	{
		//Check firstly , that the Queue is empty or not
		if(isEmpty())
		{
			throw new QueueemptyException("Queue is empty"); //Throws the exception if the queue is empty
		}
		
		int element = front.data; //Get the data from the front data
		
		front = front.next; //Move front to the next node in the queue
		
		if(front == null)
		{
			rear = null; //If queue becomes empty , rear should also become to null
		}
		
		size--; //Decrease the size of the queue
		
		System.out.println("Dequeued: " + element); 
		
		return element;
		
	}

	//Peek: Returns the front element without removing it
	@Override
	public int peek() throws QueueemptyException 
	{
		//Checking if the queue is empty or not
		if(isEmpty())
		{
			throw new QueueemptyException("Queue is empty"); //Throws the exception if the queue is empty
		}
		
		return front.data; //Returns the data from the front node
	}

	//Checks if the queue is empty
	@Override
	public boolean isEmpty() 
	{
		return front == null; //Queue is empty if front is null
	}

	//Returns the number of elements in the queue
	@Override
	public int size() 
	{
		return size; //Returns the size of the queue
	}
}
