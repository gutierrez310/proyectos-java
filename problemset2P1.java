import java.util.Scanner;
import java.lang.Math;

/* Write a program to calculate the credit card balance after one year if a person only pays the minimum 
monthly payment required by the credit card company each month. The following variables contain values as 
described below:

balance - the outstanding balance on the credit card

annualInterestRate - annual interest rate as a decimal

monthlyPaymentRate - minimum monthly payment rate as a decimal

For each month, calculate statements on the monthly payment and remaining balance. At the end of 12 months, 
print out the remaining balance. Be sure to print out no more than two decimal digits of accuracy - so print


	      # Test Case 1:
	      balance = 42
	      annualInterestRate = 0.2
	      monthlyPaymentRate = 0.04
	      
	      # Result Your Code Should Generate Below:
	      Remaining balance: 31.38
*/

import java.util.Scanner;
public class Problem1 {
    
    public static double minimumMonthlyPayment(double balance,double mrate) {
        return (balance*mrate);
    }
    public static double interestAfterMonthlyMinPayment(double arate,double mrate,double balance) {
        return (arate / 12 * monthlyUnpaidBalance(balance, mrate));
    }
    public static double monthlyUnpaidBalance(double balance,double mrate) {
        return (balance - minimumMonthlyPayment(balance, mrate));
    }
    public static double remainingBalance(double balance,double mrate,double arate){
        double unpaidBalance=monthlyUnpaidBalance(balance, mrate);
        double thisMonthsInterest = interestAfterMonthlyMinPayment(arate, mrate, balance);
	return unpaidBalance + thisMonthsInterest;
    }
    public static void main(String[] args) {
	    /*Scanner scanner = new Scanner(System.in);
        System.out.println("balance = ");
	    double balance = scanner.nextDouble();
	    System.out.println("\nannualInterestRate = ");
        double annualInterestRate = scanner.nextDouble();
	    System.out.println("\nmonthlyPaymentRate = ");
	    double monthlyPaymentRate = scanner.nextDouble();
        scanner.close();*/
        double balance=42;
        double annualInterestRate=0.2;
        double monthlyPaymentRate=0.04;
        
	    double currentBalance = balance;
	    double ARATE = annualInterestRate;
	    double MRATE = monthlyPaymentRate;
	    double summ = 0;
	    for(int i=0; i < 12 ;i++){
            summ = summ + minimumMonthlyPayment(currentBalance,MRATE);
	        currentBalance = remainingBalance(currentBalance, MRATE, ARATE);
    	}
    	
	    System.out.println(Math.round(currentBalance*100.0)/100.0);
    }
    
}

