package org.mic.pess;

import java.util.Scanner;

public class Fibonacci {

    public Fibonacci() {
        int numberOne = 0, numberTwo = 1, numberThree, count; 	
        
    	Scanner inputScanner = new Scanner(System.in);
    	System.out.println("Enter number of counts: ");
    	count = inputScanner.nextInt();  
    	
        for (int i = 2; i < count; i++) {
            numberThree = numberOne + numberTwo;
            System.out.println(" " + numberThree);
            numberOne = numberTwo;
            numberTwo = numberThree;
        }
    }
}
