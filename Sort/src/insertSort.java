
public class insertSort
{
	int[] arr;
	
	public insertSort(int[] array)
	{
		this.arr = array;
	}
	
	public void ascSort()
	{
		long startTime = System.currentTimeMillis();
		if(arr.length < 1)
		{
			return;
		}
		
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = 0; j < i; j++)
			{
				int tmp;
				if(arr[i] < arr[j])
				{
					tmp = arr[i];
					for(int k = i - 1; k >= j; k--)
					{
						arr[k + 1] = arr[k];
					}
					arr[j] = tmp;
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.print("insert ascSort = ");
		dump();
		System.out.print("    , Time = " + (endTime - startTime));
		System.out.println();
	}
	
	public void descSort()
	{
		long startTime = System.currentTimeMillis();
		if(arr.length < 1)
		{
			return;
		}
		
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = 0; j < i; j++)
			{
				int tmp;
				if(arr[i] > arr[j])
				{
					tmp = arr[i];
					for(int k = i - 1; k >= j; k--)
					{
						arr[k + 1] = arr[k];
					}
					arr[j] = tmp;
				}
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.print("insert descSort = ");
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
