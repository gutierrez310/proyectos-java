package java_testing2;

//import java.util.HashMap;

public class GCF {
	public int[] factors(int a) {     //Obtains all possible factors of a number
		int[] array= new int[(int)a];
		int b = 0;
		for(int i=1; i <= a; i++) {
			if(a%i == 0) { 	
				array[b] = i;
				b++;
			}
		}
		int[] noZeros = new int[b];
		for(int i=0; i < b; i++) {
			noZeros[i] = array[i];
		}
		return noZeros;
	}
	
	public int[] uniqueNumbers(int[] a, int[] b){    //Intersection of two arrays
		int[] newArray = new int[Math.max(a.length, b.length)];
		int k = 0;
		for(int i = 0; i < a.length; i++){
			for(int j=0;j < b.length; j++){
	        	if(a[i]==b[j]){
	        		newArray[k]=b[j];
	        		k++;
	            }
	        }
	    }
		int[] noZeros = new int[k];
		for(int i=0; i < k; i++) {
			noZeros[i] = newArray[i];
		}
		return noZeros;
	}
	
	public void GCF(int[] array) {                //GCF
		//HashMap<Integer, Integer> CommonFactors = new HashMap();
//		if(array.length == 0) {
//			return 0;
//		}
		int[] CommonFactors = new int[0];
		for(int i = 0; i< array.length; i++) {
			int[] currentArrayOfFactors = this.factors(array[i]);
			System.out.println("\nThe factors of " + array[i]);
			for(int j = 0; j < currentArrayOfFactors.length; j++) {
				System.out.print(currentArrayOfFactors[j]+" ");
			}
			if(CommonFactors.length==0)	{
				CommonFactors = currentArrayOfFactors;
			} else {
				CommonFactors = uniqueNumbers(CommonFactors,currentArrayOfFactors);
			}
		}
		int max = CommonFactors[0];
		// iterate and compare from array index 1
		for(int i = 1; i < CommonFactors.length; i++){

			if(max < CommonFactors[i]){
				max = CommonFactors[i];
			}
		}
		System.out.println("\n\nGCF:\t" + max);
	}

}
