package Question_01;

public interface Queue 
{
	
	void enqueue(int element); //Adds an element to the back of the queue
	
	int dequeue(); //Removes and return the front element of the queue
	
	boolean isEmpty(); //Checks if the queue contains any element
	
	boolean isFull(); //Checks if the queue has reached its maximum capacity(if applicable)

}
