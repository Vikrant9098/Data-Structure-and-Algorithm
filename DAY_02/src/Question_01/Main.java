package Question_01;

public class Main 
{
	public static void main(String...queue)
	{
		//Creating the queue with a capacity of 5
		Queue queue1 = new ArrayQueue(5);
		
		//Adding the elements in the queue
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(30);
		queue1.enqueue(40);
		queue1.enqueue(50);
		
		//Check if the queue is full or not
		System.out.println("Is Queue full? (Check_01) " + queue1.isFull());
		
		//Remove and print front element
		System.out.println("Dequeued: " + queue1.dequeue());
		
		//Check if the queue is empty or not
		System.out.println("Is Queue empty? " + queue1.isEmpty());
		
		//Check if the queue is full or not
		System.out.println("Is Queue full? (Check_02) " + queue1.isFull());
			
	}
}

