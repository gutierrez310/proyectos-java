import java.util.Scanner;
import java.lang.Math;

/*
Assume s is a string of lower case characters.
Write a program that prints the longest substring of s in which the letters occur in 
alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print

Longest substring in alphabetical order is: beggh

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your 
program should print

Longest substring in alphabetical order is: abc
*/

public class Problem3 { 
    public static void main(String args[]) {
        /*Scanner scanner = new Scanner(System.in);
        String s = scan.nextLine();
	    scanner.close();*/
	    String s = "azcbobobegghakl";
	    String longestStringHere="";
	    String longest="";
	    int summ=0;
	    for(int i=0; i < s.length(); i++){
	        summ=0;
	        try{
	            longestStringHere=""+s.charAt(i);
                while(s.charAt(i) <= s.charAt(i+1)){
                    longestStringHere=longestStringHere+s.charAt(i+1);
                    if(i+1>s.length())
                        break;
                    i++;
                    summ++;
	            }
                if(summ+1>longest.length())
                    longest=longestStringHere;
	        } catch(Exception e){
	            break;
	        }
	    }
            if(summ+1>longest.length())
                longest=longestStringHere;
	    System.out.println(longest);
    }
}