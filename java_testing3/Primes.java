package java_testing3;

public class Primes {
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
	public boolean prime(int prime) {
		return factors(prime).length == 2;
	}
}
