
public class CustomStack
{
	QueueNode head;

	public CustomStack()
	{
		head = null;
	}
	
	public void push(String data)
	{
		if(head == null)
		{
			head = new QueueNode(data);
		}
		else
		{
			QueueNode newNode = new QueueNode(data);
			newNode.linkedNode = head;
			head = newNode;
		}
		dump();
	}
	
	public void pop()
	{
		if(head == null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("pop = " + head.getData());
			QueueNode free = head;
			head = head.linkedNode;
			free = null;
		}
		dump();
	}
	
	public void dump()
	{
		if(head != null)
		{
			System.out.print("Stack = ");
			QueueNode temp = head;
			while(temp.linkedNode != null)
			{
				System.out.print(temp.getData() + " ");
				temp = temp.linkedNode;
			}
			System.out.print(temp.getData() + " ");
			System.out.println();
		}
	}
}
