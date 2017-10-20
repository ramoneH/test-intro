package Learn;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(calculateSum(5, 10));
		multiplySum(5,10);
		subtractSum(3,-9);
		divideSum(50,10);
 
	}

	static int calculateSum(int a, int b) {
		return a + b;
	}
	static void multiplySum(int a, int b) {
		System.out.println(a*b);
	}
	static void divideSum(int a, int b) {
		System.out.println(a/b);
	}
	static void subtractSum(int a , int b) {
		System.out.println(a-b);
	}
    
	
}