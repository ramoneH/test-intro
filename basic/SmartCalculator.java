
package basic;

import java.util.Scanner;

public class SmartCalculator {	
	public static void main(String[] args) { 
		
		System.out.println("Please enter a number");
		int number = new Scanner(System.in).nextInt();
	    	
	}  
	
	static int smartCalculator(int num1, int num2, String operator) {
		
		if(operator.equals("+")) {
			return num1 + num2;
		}
		
		else if(operator.equals("-")) {
			return num1 - num2;
		}
		
		else if(operator.equals("*")) {
			return num1 * num2;
		}
		
		
		
		return 0;
		
	}
}
