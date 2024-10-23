package Question_01;

public class Node
{
	int data; //Holds the integer data
	Node next; //Points to the next node in the linked list
	
	public Node(int data)
	{
		this.data = data;
		this.next = null; //New node doesn't point to any node initially (next is null)
	}

}
