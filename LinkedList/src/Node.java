
public class Node
{
	private String data;
	Node linkedNode;
	
	public Node()
	{
		this.data = null;
		this.linkedNode = null;
	}
	
	public Node(String data)
	{
		this.data = data;
		this.linkedNode = null;
	}
	
	public void setData(String data)
	{
		this.data = data;
	}
	
	public String getData()
	{
		return this.data;
	}
}
