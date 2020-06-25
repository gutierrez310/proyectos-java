package BubbleSorting;

public class main {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] array = {5,2,4,3,1};
		
		System.out.println("The array to sort is the following: ");
		for(int i=0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nAfter being sorted: ");
		array = bs.bubbleSort(array);
		for(int i=0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
