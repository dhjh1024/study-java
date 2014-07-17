
public class selectionSort
{
	int[] arr;
	
	public selectionSort(int[] array)
	{
		this.arr = array;
	}
	
	public void ascSort()
	{
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < arr.length ; i++)
		{
			int minIndex = i;
			for(int j = i + 1; j < arr.length ; j++)
			{
				if(arr[minIndex] > arr[j])
				{
					minIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.print("selection ascSort = ");
		dump();
		System.out.print("    , Time = " + (endTime - startTime));
		System.out.println();
	}
	
	public void descSort()
	{
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < arr.length - 1 ; i++)
		{
			int maxIndex = i;
			for(int j = i + 1; j < arr.length ; j++)
			{
				if(arr[maxIndex] < arr[j])
				{
					maxIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = tmp;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.print("selection descSort = ");
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

