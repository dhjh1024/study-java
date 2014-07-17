
public class CustomQueue
{
	QueueNode head;
	
	public CustomQueue()
	{
		head = null;
	}
	
	public void push(String data)
	{
		if(head == null)
		{
			head = new QueueNode();
			head.setData(data);
			head.linkedNode = null;
		}
		else
		{
			QueueNode tail = head;
			
			while(tail.linkedNode != null)
				tail = tail.linkedNode;
				
			tail.linkedNode = new QueueNode(data);
		}
		System.out.print("Queue = ");
		dump();
	}
	
	public void pop()
	{
		String data = null;
		if(head == null)
		{
			System.out.println("Queue is Empty");
			return;
		}
		else
		{
			data = head.getData();
			QueueNode free = head;
			head = head.linkedNode;
			free = null;
			
		}
		System.out.println("pop = " + data);
		System.out.print("Queue = ");
		dump();
	}
	
	public void dump()
	{
		if(head == null)
		{
			System.out.println("Queue is Empty");
		}
		QueueNode dumpNode;
		dumpNode = head;
		
		while(dumpNode.linkedNode != null)
		{
			System.out.print(dumpNode.getData() + " ");
			dumpNode = dumpNode.linkedNode;
		}
		System.out.print(dumpNode.getData() + " ");
		System.out.println();
	}
}
