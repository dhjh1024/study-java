
public class main
{

	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		
		linkedList.pushBottom("111");
		linkedList.pushBottom("222");
		linkedList.pushBottom("333");
		
		linkedList.pushBottom("444");
		linkedList.pushBottom("555");

		System.out.print("swap before = ");
		linkedList.dump();
		System.out.println();
		
		linkedList.swap(linkedList.search("444"), linkedList.search("333"));
		
		
		System.out.print("swap after = ");
		linkedList.dump();
		System.out.println();
		
		//linkedList.swap(linkedList.search("333"), linkedList.search("444"));
		
		System.out.print("swap after = ");
		linkedList.dump();
		System.out.println();
		
		//linkedList.popBottom();
		//linkedList.popTop();
		//linkedList.popBottom();
	}
	

}
