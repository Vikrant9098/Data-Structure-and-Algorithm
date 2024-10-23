package Question_01;

public class Main 
{
	public static void main(String...singularlinkedlist)
	{
		
			try {
				//Create a new instance of SinglyLinkedlistQueue
				LinkedListQueue queue1 = new LinkedListQueue();								
							
				//Add elements to the queue
				queue1.enqueue(10); 
				queue1.enqueue(20); 
				queue1.enqueue(30); 
				
				//Peek at the front element of the queue
				System.out.println("Peek: " + queue1.peek()); 
				
				//Dequeue and print the front element
				queue1.dequeue();
				
				//peek at the new front element of the queue
				System.out.println("Peek: " + queue1.peek());
				
				//Print the current size of the queue
				System.out.println("Queue size: " + queue1.size());
			} 
			catch (QueueemptyException e) 
			{
				System.out.println(e.getMessage());
			}
			
	}
}
