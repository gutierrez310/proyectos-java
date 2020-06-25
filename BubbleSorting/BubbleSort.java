package BubbleSorting;

public class BubbleSort {
	public void compare() {
		
	}
	public int[] bubbleSort(int[] array) {
		boolean bool = true;
		int len = array.length;
		int temp;
		while(bool) {
			bool = false;
			for(int i = 0; i < len-1; i++) {
				if(array[i] > array[i+1]) {
					temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					bool = true;
				}
			}
		}
		return array;
	}
}
