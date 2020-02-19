import java.util.Scanner;
import java.lang.Math;

/*
Assume s is a string of lower case characters.
Write a program that prints the number of times the string 'bob' occurs in s.
For example, if s = 'azcbobobegghakl', then your program should print

Number of times bob occurs is: 2
*/


public class Problem2 { 
   public static void main(String args[]) {
	/*Scanner scanner = new Scanner(System.in);
        String s = scan.nextLine();
	scanner.close();*/
	String s = "azcbobobegghakl";
	int bobs=0;
	for(int i=0; i < s.length()-2;i++){
        char a=s.charAt(i);
        char b=s.charAt(i+1);
        char c=s.charAt(i+2);
    	    if(a =='b' && b =='o' && c =='b')
                bobs++;
	}
	System.out.println(bobs);
    }
}