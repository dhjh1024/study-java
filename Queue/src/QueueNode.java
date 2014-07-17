
public class QueueNode
{
	private String data;
	public QueueNode linkedNode;
	
	public QueueNode()
	{
		this.data = null;
		linkedNode = null;
	}
	
	public QueueNode(String Data)
	{
		this.data = Data;
		linkedNode = null;
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
