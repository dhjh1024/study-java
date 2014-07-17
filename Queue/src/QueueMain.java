public class QueueMain
{
	public static void main(String[] arg)
	{
		excuteQueue();
		System.out.println();
		System.out.println();
		excuteStack();
	}
	
	private static void excuteQueue()
	{
		CustomQueue queue = new CustomQueue();
		queue.push("111");
		queue.push("222");
		queue.push("333");
		queue.pop();
		queue.push("444");
		queue.push("555");
		queue.push("666");
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
	}
	
	private static void excuteStack()
	{
		CustomStack queue = new CustomStack();
		queue.push("111");
		queue.push("222");
		queue.push("333");
		queue.pop();
		queue.push("444");
		queue.push("555");
		queue.push("666");
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
	}
}
