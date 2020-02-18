import java.util.Scanner;
import java.lang.Math;

/*
Now write a program that calculates the minimum fixed monthly payment needed in order pay off a credit
card balance within 12 months. By a fixed monthly payment, we mean a single number which does not
change each month, but instead is a constant amount that will be paid each month.
The following variables contain values as described below:

balance - the outstanding balance on the credit card

annualInterestRate - annual interest rate as a decimal

The program should print out one line: the lowest monthly payment that will pay off all debt in under 1 year, for example:

 Lowest Payment: 180 

Assume that the interest is compounded monthly according to the balance at the end of the month
(after the payment for that month is made). The monthly payment must be a multiple of $10 and is the
same for all months. Notice that it is possible for the balance to become negative using this payment
scheme, which is okay. A summary of the required math is found below:
Monthly interest rate = (Annual interest rate) / 12.0
Monthly unpaid balance = (Previous balance) - (Minimum fixed monthly payment)
Updated balance each month = (Monthly unpaid balance) + (Monthly interest rate x Monthly unpaid balance)
*/


public class Problem2 { 

   public static void main(String args[]) {
    /*double balance = 319.0; 
    double annualInterestRate = 0.25;
    */
    Scanner scanner = new Scanner(System.in);   
    System.out.println("balance = ");
    double balance = scanner.nextDouble();
    System.out.println("\nannualInterestRate = ");
    double annualInterestRate = scanner.nextDouble();
    scanner.close();

    double balance1 = balance;
    int payment = 0;
    while(true){
        if(balance1 < 0)
            break;
        balance1 = balance;
        for(int i; i<12; i++){
            balance1=balance1-payment;
            balance1=balance1*(1+annualInterestRate/12.0);
        }
        payment = payment + 10;
    }
    
    System.out.println(payment-10);


   }
}


/*   LO SIGUIENTE SON EJERCICIOS BASICOS DE HACKERRANK
public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N %2 == 1) {
            System.out.println("Weird");
        } else {
            if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}



public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s;
        scan.nextLine();
        s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}




*/