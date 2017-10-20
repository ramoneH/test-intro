package Learn;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter A Number For A Multiplication Table");
		int n = new Scanner(System.in).nextInt();
		for (int i =0;i<=10;i++) {
			System.out.println(n + "X" + i + "=" + n*i);
		}
		System.out.println("this is a multiplication table");
		System.out.println("for the number " + n + " From 0-10");
	}

}
