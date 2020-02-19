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
	int bobs=0;
	for(int i=0; i < s.length()-2;i++):
    	    if(s.charAt(i) =="b" && s.charAt(i+1) =="o" && s.charAt(i+2) =="b")
                bobs++;
	System.out.println(bobs);
    }
}