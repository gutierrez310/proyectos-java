package palindrome;

public class main {
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		String str = new String();
		str = "hola aloh";
		
		System.out.println("Is the string '" + str + "' a palindrome?");
		System.out.println(p.palindrome(str));
	}

}
