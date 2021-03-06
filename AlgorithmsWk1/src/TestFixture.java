import java.util.LinkedList;

public class TestFixture {
	private int arraySize;

	public void setArraySize(int arraySize) {
		this.arraySize= arraySize;
	}

	public int getArraySize() {
		return this.arraySize;
	}

	public void fillArray(int[] startingArray) {
		for(int index = 0; index < startingArray.length; index++)
		{
			startingArray[index] = (int)(Math.random()*2000 * startingArray.length);
		}
	}

	public void printArray(int[] array) {
		for(int index : array)
		{
			System.out.print(index + ", ");
			if(0 == index % 10)
			{
				System.out.println();
			}
		}
		System.out.println();
	}

	public void printList(LinkedList<Integer> List) {
		System.out.println(List);
	}

	public void copyArray(int[] startingArray, int[] mergeSortArrayCopy) {
		for(int index = 0; index < startingArray.length; index++)
		{
			mergeSortArrayCopy[index] = startingArray[index];
		}
	}

	public void copyStartingArrayToStartingList(
			int[] startingArray, 
			LinkedList<Integer> startingList) 
	{
		for(int index = 0; index < startingArray.length; index++)
		{
			startingList.addLast(startingArray[index]);
		}
	}

	public void copyList(
			LinkedList<Integer> startingList, 
			LinkedList<Integer> ListCopy) 
	{
		ListCopy.addAll(startingList);
	}

	public void mergeSortTheArray(int[] list) {
		if (list.length > 1) {
			// Merge sort the first half
			int[] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSortTheArray(firstHalf);
			// Merge sort the second half
			int secondHalfLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length / 2,
					secondHalf, 0, secondHalfLength);
			mergeSortTheArray(secondHalf);
			// Merge firstHalf with secondHalf into list
			mergeArray(firstHalf, secondHalf, list);
		}
	}

	private void mergeArray(int[] list1, int[] list2, int[] temp) {
		int current1 = 0; 
		int current2 = 0; 
		int current3 = 0; 

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	}

	public void mergeSortTheList(LinkedList<Integer> list) {
		if (list.size() > 1) {
			// Merge sort the first half
			LinkedList<Integer> firstHalf=new LinkedList<Integer>();
			firstHalf.addAll(list.subList(0, list.size() / 2));
			//System.out.print("First Half:\t");
			//System.out.println(firstHalf);
			mergeSortTheList(firstHalf);
			// Merge sort the second half
			LinkedList<Integer> secondHalf=new LinkedList<Integer>();
			secondHalf.addAll(list.subList(list.size()/2,list.size() ));
			//System.out.print("Second Half:\t");
			//System.out.println(secondHalf);
			mergeSortTheList(secondHalf);
			// Merge firstHalf with secondHalf into list
			mergeList(firstHalf, secondHalf, list);
		}
	}

	/** Merge two sorted lists */
	private void mergeList(
			LinkedList<Integer> firstHalf, 
			LinkedList<Integer> secondHalf, 
			LinkedList<Integer> temp) 
	{

		int current1 = 0; 
		int current2 = 0; 
		int current3 = 0; 

		while (current1 < firstHalf.size() && current2 < secondHalf.size()) 
		{
			if (firstHalf.get(current1) < secondHalf.get(current2))
			{
				temp.set(current3, firstHalf.get(current1));
				current1++;
				current3++;
			}
			else
			{
				temp.set(current3, secondHalf.get(current2));
				current2++;
				current3++;
			}
			//System.out.println("Temp");
			//System.out.println(temp);
		}
		while (current1 < firstHalf.size())
		{
			temp.set(current3, firstHalf.get(current1));
			current1++;
			current3++;
			//System.out.println("Temp2");
			//System.out.println(temp);
		}
		while (current2 < secondHalf.size())
		{
			temp.set(current3, secondHalf.get(current2));
			current2++;
			current3++;
			//System.out.println("Temp3");
			//System.out.println(temp);
		}
	}


	public void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}

	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}

	/** Partition the array list[first..last] */
	private static int partition(int[] list, int first, int last) {
		int pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search
		while (high > low) {
			// Search forward from left
			while (low <= high && list[low] <= pivot)
				low++;
			// Search backward from right
			while (low <= high && list[high] > pivot)
				high--;
			// Swap two elements in the list
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		while (high > first && list[high] >= pivot)
			high--;
		// Swap pivot with list[high]
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else {
			return first;
		}
	}



	public void quickSortList(LinkedList<Integer> quickSortListCopy) {
		quickSortList(quickSortListCopy, 0, quickSortListCopy.size() - 1);
	}

	private void quickSortList(
			LinkedList<Integer> list, 
			int first, int last) {
		if (last > first) {
			int pivotIndex = partitionList(list, first, last);
			quickSortList(list, first, pivotIndex - 1);
			quickSortList(list, pivotIndex + 1, last);
		}
		
	}

	private int partitionList(LinkedList<Integer> list, int first, int last) {
		int pivot = list.get(first); // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search
		while (high > low) {
			// Search forward from left
			while (low <= high && list.get(low) <= pivot)
				low++;
			// Search backward from right
			while (low <= high && list.get(high) > pivot)
				high--;
			// Swap two elements in the list
			if (high > low) {
				int temp = list.get(high);
				list.set(high, list.get(low));
				list.set(low, temp);
			}
		}
		while (high > first && list.get(high) >= pivot)
			high--;
		// Swap pivot with list[high]
		if (pivot > list.get(high)) {
			list.set(first, list.get(high));
			list.set(high, pivot);
			return high;
		}
		else {
			return first;
		}
	}
}