package java_testing3;

public class main {

	public static void main(String[] args) {
		Primes p = new Primes();
		int myPrime = 19;
		System.out.println("Is "+ myPrime +" a prime?");
		System.out.println(p.prime(myPrime));
	}

}
