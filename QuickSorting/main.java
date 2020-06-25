package QuickSorting;

public class main {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] array = {2,5,4,3,1};
		
		System.out.println("The array to sort is the following: ");
		for(int i=0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nAfter being sorted: ");
		array = qs.QuickSortRecursive(array);
		for(int i=0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
