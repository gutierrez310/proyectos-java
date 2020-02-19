import java.util.Scanner;
import java.lang.Math;

/*
You'll notice that in Problem 2, your monthly payment had to be a multiple of $10.
Why did we make it that way? You can try running your code locally so that the payment
can be any dollar and cent amount (in other words, the monthly payment is a multiple
of $0.01). Does your code still work? It should, but you may notice that your code runs
more slowly, especially in cases with very large balances and interest rates. (Note:
when your code is running on our servers, there are limits on the amount of computing
time each submission is allowed, so your observations from running this experiment on
the grading system might be limited to an error message complaining about too much time
taken.) Well then, how can we calculate a more accurate fixed monthly payment than we
did in Problem 2 without running into the problem of slow code? We can make this program
run faster using a technique introduced in lecture - bisection search!
The following variables contain values as described below:

balance - the outstanding balance on the credit card

annualInterestRate - annual interest rate as a decimal

To recap the problem: we are searching for the smallest monthly payment such that we can
pay off the entire balance within a year. What is a reasonable lower bound for this
payment value? $0 is the obvious answer, but you can do better than that. If there was
no interest, the debt can be paid off by monthly payments of one-twelfth of the original
balance, so we must pay at least this much every month. One-twelfth of the original
balance is a good lower bound. What is a good upper bound? Imagine that instead of paying
monthly, we paid off the entire balance at the end of the year. What we ultimately pay
must be greater than what we would've paid in monthly installments, because the interest
was compounded on the balance we didn't pay off each month. So a good upper bound for the
monthly payment would be one-twelfth of the balance, after having its interest compounded
monthly for an entire year. In short:

Monthly interest rate = (Annual interest rate) / 12.0
Monthly payment lower bound = Balance / 12
Monthly payment upper bound = (Balance x (1 + Monthly interest rate)12) / 12.0
*/


public class Problem3 { 

   public static void main(String args[]) {
        double balance = 31900.0; 
        double annualInterestRate = 0.25;
        /*
        Scanner scanner = new Scanner(System.in);   
        System.out.println("balance = ");
        double balance = scanner.nextDouble();
        System.out.println("\nannualInterestRate = ");
        double annualInterestRate = scanner.nextDouble();
        scanner.close();*/

        //double balance1 = balance;
        double actual_monthly_rate = annualInterestRate/12.0;
        double actual_yearly_rate = Math.pow((1+actual_monthly_rate),12);
        double top = balance*actual_yearly_rate/12.0;
        double bottom = balance/12.0;
    
        while(Math.abs(chekar((bottom+top)/2.0,actual_monthly_rate,balance)) > 0.01){
            if(chekar((bottom+top)/2.0,actual_monthly_rate,balance) > 0.01)
                bottom=(bottom+top)/2.0;
            else
                top=(bottom+top)/2.0;
        }
        double resultado=(bottom+top)/2.0;
    
        System.out.println("Lowest Payment: "+ Math.round(resultado*100.0)/100.0);

    }
    
    public static double chekar(double monthlyPaymentRate,double monthlyInterestRate,double balance){
        for(int i=0;i < 12;i++)
            balance = balance -  monthlyPaymentRate + ((balance - monthlyPaymentRate) * monthlyInterestRate);
        return balance;
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