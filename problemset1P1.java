import java.util.Scanner;
import java.lang.Math;

/*
Assume s is a string of lower case characters.

Write a program that counts up the number of vowels contained in the strings.
Valid vowels are: 'a', 'e', 'i', 'o', and 'u'. For example, if s = 'azcbobobegghakl',
your program should print:

Number of vowels: 5
*/


public class Problem1 { 

   public static void main(String args[]) {
	/*Scanner scanner = new Scanner(System.in);
        String s = scan.nextLine();
	scanner.close();*/
	String s = "azcbobobegghakl";
	int numVowels=0;
	for(int i=0; i < s.length(); i++)
	    if(s.charAt(i)=="a" ||s.charAt(i)=="e" ||s.charAt(i)=="i" ||s.charAt(i)=="o" ||s.charAt(i)=="u")
	        numVowels++;
	System.out.println("Number of valid vowels: " + numVowels);
   }
}