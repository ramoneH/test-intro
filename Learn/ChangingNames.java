package Learn;

import java.util.Scanner;

public class ChangingNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Name In LowerCase");
		
		String nam1 = new Scanner(System.in).nextLine();
   
   		System.out.println("Oh your name IS " + nam1);
   		
   		System.out.println("But Its Really " + nam1.toUpperCase());
   
   		System.out.println("Enter your Name In ALL CAPS");
   
   		String nam2 = new Scanner(System.in).nextLine();
   		
		System.out.println("Oh your name IS " + nam2);
		
		System.out.println("But Its Really " + nam2.toLowerCase());
   
		


	}

	}


