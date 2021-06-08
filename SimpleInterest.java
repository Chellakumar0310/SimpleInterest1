
package javaapplication1;

import java.util.Scanner;


public class SimpleInterest {

    
    public static void main(String[] args) {
        double Principal,RateOfInterest;
        int NoOfYears;
        double SimpleInterest;
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        Principal = in.nextDouble();
        System.out.print("\n Enter the Rate of Interest: ");
        RateOfInterest = in.nextDouble();
        System.out.print("\n No of Years: ");
        NoOfYears = in.nextInt();
        SimpleInterest = Principal * RateOfInterest * NoOfYears/100;
        System.out.printf("\nSimpleInterest = %.2f", SimpleInterest);
        
                
        
    }
    
}


