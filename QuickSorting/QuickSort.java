package QuickSorting;

public class QuickSort {
	public int[] getValuesBelowPivot(int[] array,int pivot){
		int[] subArray=new int[array.length];
		int j = 0;
		for(int i=0; i < array.length; i++) {
			if(array[i] < pivot) {
				subArray[j] = array[i];
				j++;
			}
		}
		int[] noZeros = new int[j];
		for(int i=0; i < j; i++) {
			noZeros[i] = subArray[i];
		}
		return noZeros;
	}
	
	public int[] getValuesAbovePivot(int[] array,int pivot){
		int[] subArray=new int[array.length];
		int j = 0;
		for(int i=0; i < array.length; i++) {
			if(array[i] > pivot) {
				subArray[j] = array[i];
				j++;
			}
		}
		int[] noZeros = new int[j];
		for(int i=0; i < j; i++) {
			noZeros[i] = subArray[i];
		}
		return noZeros;
	}
	
	public int[] QuickSortRecursive(int[] array) {
		if(array.length >= 2) {
			int[] AboveArray = QuickSortRecursive(getValuesAbovePivot(array,array[0]));
			int[] BelowArray = QuickSortRecursive(getValuesBelowPivot(array,array[0]));
			int[] newArray = new int[AboveArray.length + BelowArray.length + 1];
			for(int i =0; i < BelowArray.length;i++) {
				newArray[i] = BelowArray[i];
			}
			newArray[BelowArray.length]=array[0];  //pivot = array[0]
			for(int i = BelowArray.length+1; i < BelowArray.length+AboveArray.length+1;i++) {
				newArray[i] = AboveArray[i-BelowArray.length-1];
			}
			return newArray;
		} else{
			if(array.length ==2) {
				if(array[0] > array[1]){
					int temp = array[0];
					array[0] = array[1];
					array[1] = temp;
				} 
				return array;
			} else {
				return array;
			}
		} 
	}
}
