package Question_04;

public interface Queue<T> 
{
	void enqueue (T item) throws QueuefullException; 
	T dequeue() throws QueueemptyException;
	boolean isEmpty();
	boolean isFull();
	int size();
}
