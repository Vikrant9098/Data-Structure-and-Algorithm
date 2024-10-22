package Question_04;

public class Main 
{
	public static void main(String...queue)
	{
		
			//Create a new GenericQueue of Integers with a capacity of 5
			GenericQueue<Integer> queue1 = new GenericQueue<>(5);
			
			try {
				
				//Print the current size of the queue
				System.out.println("Queue size is: " + queue1.size());
				
				//Enqueue elements
				queue1.enqueue(01);
				queue1.enqueue(02);
				queue1.enqueue(03);
				queue1.enqueue(04);
				queue1.enqueue(05);
												
				//Attempt to enqueue another element , which should through the exception
				queue1.enqueue(06); //This should throw QueuefullException
				
				} 
				catch (QueuefullException e) 
				{
					System.out.println(e.getMessage());
				}
			
			//Print the current size of the queue
			System.out.println("Queue size is: " + queue1.size());
			
			
			try {
				//Dequeue an element and print it
				System.out.println("Dequeued elements is: " + queue1.dequeue());
				//Dequeue an element and print it
				System.out.println("Dequeued elements is: " + queue1.dequeue());
				//Dequeue an element and print it
				System.out.println("Dequeued elements is: " + queue1.dequeue());
				//Dequeue an element and print it
				System.out.println("Dequeued elements is: " + queue1.dequeue());
				//Dequeue an element and print it
				System.out.println("Dequeued elements is: " + queue1.dequeue());
				} 
				catch (QueueemptyException e) 
				{
					System.out.println(e.getMessage()); //Handle empty queue
				}
			
			//Attempt to dequeue one more element to trigger the QueueEmptyException
			try {
				//Dequeue an element and print it
				System.out.println("Dequeued elements is: " + queue1.dequeue());
			} 
			catch (QueueemptyException e) 
			{
				System.out.println(e.getMessage()); //Handle empty queue
			}
		
	}

}
