
public class main
{

	public static void main(String[] args)
	{
		int[] arr = {3,5,7,4,71,2,33,35,6,17,23};
		
		bubbleSort bubble = new bubbleSort(arr);
		bubble.ascSort();
		bubble.descSort();
		
		System.out.println();
		
		quickSort quick = new quickSort(arr);
		quick.ascSort();
		quick.descSort();
		
		System.out.println();
		
		selectionSort selection = new selectionSort(arr);
		selection.ascSort();
		selection.descSort();
		
		System.out.println();
		
		insertSort insert = new insertSort(arr);
		insert.ascSort();
		insert.descSort();
		
		System.out.println();
		
		mergeSort merge = new mergeSort(arr);
		merge.ascSort();
		merge.descSort();
	}

}
