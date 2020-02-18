import java.util.Scanner;
import java.lang.Math;

/* Write a program to calculate the credit card balance after one year if a person only pays the minimum 
monthly payment required by the credit card company each month. The following variables contain values as 
described below:

balance - the outstanding balance on the credit card

annualInterestRate - annual interest rate as a decimal

monthlyPaymentRate - minimum monthly payment rate as a decimal

For each month, calculate statements on the monthly payment and remaining balance. At the end of 12 months, 
print out the remaining balance. Be sure to print out no more than two decimal digits of accuracy - so print*/


public class Problem1 {
    
    static float minimumMonthlyPayment(float balance,float mrate) {
        return (balance*mrate);
    }
    static float interestAfterMonthlyMinPayment(float arate,float mrate,float balance) {
        return (arate / 12 * monthlyUnpaidBalance(balance, mrate));
    }
    static float monthlyUnpaidBalance(float balance,float mrate) {
        return (balance - minimumMonthlyPayment(balance, mrate));
    }
    static float remainingBalance(float balance,float mrate,float arate){
        float unpaidBalance=monthlyUnpaidBalance(balance, mrate)
        float thisMonthsInterest = interestAfterMonthlyMinPayment(arate, mrate, balance)
	return unpaidBalance + thisMonthsInterest;
    }
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("balance = ");
	float balance = scanner.nextInt();
	System.out.println("\nannualInterestRate = ");
        float annualInterestRate = scanner.nextInt();
	System.out.println("\monthlyPaymentRate = ");
	float monthlyPaymentRate = scanner.nextInt();
        scanner.close();

	float currentBalance = balance
	float ARATE = annualInterestRate
	float MRATE = monthlyPaymentRate
	float summ = 0
	for (int i; i < 12 ;i++){
       	    summ = sum + minimumMonthlyPayment(currentBalance,MRATE);
	    currentBalance = remainingBalance(currentBalance, MRATE, ARATE);
	}
	System.out.println(Math.round(currentBalance*100.0)/100.0);
    }
    
}
