
public class mergeSort
{
	int[] arr;
	
	public mergeSort(int[] array)
	{
		this.arr = array;
	}
	
	public void ascSort()
	{
		long startTime = System.currentTimeMillis();
		
		int left, right, mid;
		
		left = 0;
		right = arr.length -1;
		mid = (right + left) / 2;
		
		if(right > 1)
		{
			ascSort(left, mid);
			ascSort(mid +1, right);
			ascMerge(left, mid, right);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.print("merge ascSort = ");
		dump();
		System.out.print("    , Time = " + (endTime - startTime));
		System.out.println();
	}
	
	public void ascSort(int left, int right)
	{
		int mid;
		
		mid = (right + left) / 2;
		
		if(left < right)
		{
			ascSort(left, mid);
			ascSort(mid +1, right);
			ascMerge(left, mid, right);
		}
	}
	
	public void ascMerge(int left, int mid, int right)
	{
		int leftIndex, rightIndex, sortIndex;
		
		sortIndex = leftIndex = left;
		rightIndex = mid +1;
		
		int[] sortedArr = new int[right +1];
		
		while(leftIndex <= mid && rightIndex <= right)
		{
			if(arr[leftIndex] < arr[rightIndex])
				sortedArr[sortIndex++] = arr[leftIndex++];
			else
				sortedArr[sortIndex++] = arr[rightIndex++];
		}
		
		if(leftIndex > mid)
		{
			while(rightIndex <= right)
				sortedArr[sortIndex++] = arr[rightIndex++];
		}
		
		if(rightIndex > right)
		{
			while(leftIndex <= mid)
				sortedArr[sortIndex++] = arr[leftIndex++];
		}
		
		for(int i = left; i <= sortIndex - 1 ; i++)
		{
			arr[i] = sortedArr[i];
		}
		
		sortedArr = null;
	}
	
	public void descSort()
	{
		long startTime = System.currentTimeMillis();
		
		int left, right, mid;
		
		left = 0;
		right = arr.length -1;
		mid = (right + left) / 2;
		
		if(right > 1)
		{
			descSort(left, mid);
			descSort(mid +1, right);
			descMerge(left, mid, right);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.print("merge ascSort = ");
		dump();
		System.out.print("    , Time = " + (endTime - startTime));
		System.out.println();
	}
	
	public void descSort(int left, int right)
	{
		int mid;
		
		mid = (right + left) / 2;
		
		if(left < right)
		{
			descSort(left, mid);
			descSort(mid +1, right);
			descMerge(left, mid, right);
		}
	}
	
	public void descMerge(int left, int mid, int right)
	{
		int leftIndex, rightIndex, sortIndex;
		
		sortIndex = leftIndex = left;
		rightIndex = mid +1;
		
		int[] sortedArr = new int[right +1];
		
		while(leftIndex <= mid && rightIndex <= right)
		{
			if(arr[leftIndex] > arr[rightIndex])
				sortedArr[sortIndex++] = arr[leftIndex++];
			else
				sortedArr[sortIndex++] = arr[rightIndex++];
		}
		
		if(leftIndex > mid)
		{
			while(rightIndex <= right)
				sortedArr[sortIndex++] = arr[rightIndex++];
		}
		
		if(rightIndex > right)
		{
			while(leftIndex <= mid)
				sortedArr[sortIndex++] = arr[leftIndex++];
		}
		
		for(int i = left; i <= sortIndex - 1 ; i++)
		{
			arr[i] = sortedArr[i];
		}
		
		sortedArr = null;
	}
	
	public void dump()
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
