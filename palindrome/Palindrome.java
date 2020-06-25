package palindrome;

public class Palindrome {
	public boolean palindrome(String str) {
		int len = str.length();
		
		for(int j = 0; j < len ; j++ ) {
			if(str.charAt(j) == str.charAt(len - 1 - j)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
