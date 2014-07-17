
public class LinkedList
{
	Node top;
	Node bottom;
	
	public LinkedList()
	{
		top = null;
		bottom = null;
	}
	
	public void pushTop(String data)
	{
		if(top == null)
		{
			top = new Node(data);
			bottom = top;
		}
		else
		{
			top.linkedNode = new Node(data);
			top = top.linkedNode;
		}
		System.out.println("push top = " + top.getData());
		dump();
		System.out.println();
	}
	
	public void pushBottom(String data)
	{
		if(bottom == null)
		{
			bottom = new Node(data);
			top = bottom;
		}
		else
		{
			Node newBottom = new Node(data);
			newBottom.linkedNode = bottom;
			bottom = newBottom;
		}
		System.out.println("push bottom = " + bottom.getData());
		dump();
		System.out.println();
	}
	
	public void popTop()
	{
		if(top == null)
		{
			System.out.println("LinkedList is empty");
		}
		else
		{
			System.out.println("pop top = " + top.getData());
			
			Node index = bottom;
			while(index.linkedNode != top)
				index = index.linkedNode;
			top = index;
			index.linkedNode = null;
		}
		dump();
		System.out.println();
	}
	
	public void popBottom()
	{
		if(bottom == null)
		{
			System.out.println("LinkedList is empty");
		}
		else
		{
			System.out.println("pop bottom = " + bottom.getData());
			Node free = bottom;
			bottom = bottom.linkedNode;
			free = null;
		}
		dump();
		System.out.println();
	}
	
	/*
	public void ascBubbleSort()
	{
		System.out.print("Sort = ");
		
		Node bubbleEnd = top; 
		 
		while(bottom.linkedNode != bubbleEnd)
		{
			Node bubbleStart = bottom;
			while(bubbleStart.linkedNode != null)
			{
				if(bubbleStart.getData().compareTo(bubbleStart.linkedNode.getData()) > 0)
				{
					if(bubbleStart == bottom)
					{
						bottom = bubbleStart.linkedNode; //222
					}
					if(bubbleStart.linkedNode == top)
					{
						top = bubbleStart;
					}
					Node tmp = bubbleStart; //tmp = 333, bubbleStart = 333, bubbleStart.linkedNode = 222
					bubbleStart = bubbleStart.linkedNode; //tmp = 333, bubbleStart = 222, bubbleStart.linkedNode = 111
					tmp.linkedNode = bubbleStart.linkedNode;//tmp = 333, bubbleStart = 222, bubbleStart.linkedNode = 111
					bubbleStart.linkedNode = tmp;//tmp = 333, bubbleStart = 222, bubbleStart.linkedNode = 333
					//tmp = 333, tmp.linkedNode = 111, bubbleStart = 222, bubbleStart.linkedNode = 333
					//222,333,111
				}
				
				bubbleStart = bubbleStart.linkedNode;//333
			}
			
			bubbleEnd = bubbleStart;
		}
		
		dump();
		System.out.println();
	}
	*/
	
	public Node search(String data)
	{
		Node index = bottom;
		while(index != null)
		{
			if(index.getData().compareTo(data) ==0)
				return index;
			
			index = index.linkedNode;
		}
		
		return null;
	}
	
	public void swap(Node n1, Node n2)
	{
		if(n1 == null || n2 == null)
			return;
		
		Node n1p, n2p, tmp;
		
		n1p = n2p= bottom;
		while(n1p.linkedNode != n1)
			n1p = n1p.linkedNode;
		while(n2p.linkedNode !=n2)
			n2p = n2p.linkedNode;
		
		n1p.linkedNode = n2;
		tmp = n2.linkedNode;
		n2.linkedNode = n1.linkedNode;
		n2p.linkedNode = n1;
		n1.linkedNode = tmp;
	}
	
	public void dump()
	{
		if(bottom != null)
		{
			Node index = bottom;
			while(index != null)
			{
				System.out.print(index.getData() + " ");
				index = index.linkedNode;
			}
		}
	}
}
