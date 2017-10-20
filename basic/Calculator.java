package basic;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(calculateSum(6, 13));
		printSum(10,13);
		addnumbers(15,10);

	}

	static int calculateSum(int a, int b) {
		return a + b;
	}
	static void printSum(int a, int b) {
		System.out.println(a+b);
	}
	static void addnumbers(int a, int b) {
		System.out.println(a+b);
	}
    
}