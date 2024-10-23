package Question_01;
/*
 Defines methods for a queue specifically for integers (enqueue, dequeue, peek, isEmpty, size).
 */

//Queue has a nature of FIFO type 

public interface Queue 
{
	void enqueue(int element); //Adds an item to the back of the queue
	
	int dequeue() throws QueueemptyException; //Removes and returns the front item of the queue
	
	int peek() throws QueueemptyException; //Returns the front item without removing it
	
	boolean isEmpty(); //Checks if the queue is empty or not
	
	int size(); //Returns the number of the actual elements in the queue
}



