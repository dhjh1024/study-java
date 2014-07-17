
public class bubbleSort
{
	int[] arr;
	
	public bubbleSort(int[] array)
	{
		this.arr = array;
	}
	
	public void descSort()
	{
		long startTime = System.currentTimeMillis();
		
		for(int i = arr.length - 1 ; i > 0 ; i--)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if(arr[j] < arr[j + 1])
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = tmp;
				}
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.print("bubble descSort = ");
		dump();
		System.out.print("    , Time = " + (endTime - startTime));
		System.out.println();
	}
	
	public void ascSort()
	{
		long startTime = System.currentTimeMillis();
		
		for(int i = arr.length - 1 ; i > 0 ; i--)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = tmp;
				}
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.print("bubble ascSort = ");
		dump();
		System.out.print("    , Time = " + (endTime - startTime));
		System.out.println();
	}
	
	public void dump()
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
