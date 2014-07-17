
public class quickSort
{
	int[] arr;
	
	public quickSort(int[] array)
	{
		this.arr = array;
	}
	
	public void descSort()
	{
		long startTime = System.currentTimeMillis();
		
		int left = 0;
		int right = arr.length - 1;
		descSort(left, right);
		
		long endTime = System.currentTimeMillis();
		
		System.out.print("quick  descSort = ");
		dump();
		System.out.print("    , Time = " + (endTime - startTime));
		System.out.println();
	}
	
	private void descSort(int left, int right)
	{
		if(left >= right) return;
		
		int l, r, p;
		l = left;
		r = right;
		p = arr[left];
		
		while(l < r)
		{
			while(arr[r] < p) r--;
			while(l < r && arr[l] >= p) l++;
			
			int tmp = arr[l];
			arr[l] = arr[r];
			arr[r] = tmp;
		}
		
		arr[left] = arr[l];
		arr[l] = p;
		
		descSort(left, l - 1);
		descSort(l + 1, right);
	}
	
	public void ascSort()
	{
		long startTime = System.currentTimeMillis();
		
		int left = 0;
		int right = arr.length - 1;
		ascSort(left, right);
		
		long endTime = System.currentTimeMillis();
		
		System.out.print("quick  ascSort = ");
		dump();
		System.out.print("    , Time = " + (endTime - startTime));
		System.out.println();
	}
	
	private void ascSort(int left, int right)
	{
		if(left >= right) return;
		
		int l, r, p;
		l = left;
		r = right;
		p = arr[left];
		
		while(l < r)
		{
			while(arr[r] > p) r--;
			while(l < r && arr[l] <= p) l++;
			
			int tmp = arr[l];
			arr[l] = arr[r];
			arr[r] = tmp;
		}
		
		arr[left] = arr[l];
		arr[l] = p;
		
		ascSort(left, l - 1);
		ascSort(l + 1, right);
	}
	
	public void dump()
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
}
