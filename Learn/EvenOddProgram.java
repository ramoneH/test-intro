package Learn;

public class EvenOddProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;

		int num = 20;
		if (num % 2 == 0) {

			System.out.println("This Number Is Even");
		} else {
			System.out.println("This Number Is Odd");

		}

		checkForOddNumbers(num);

	}

	static void checkForOddNumbers(int num) {

		if (num % 2 == 0) {

			System.out.println("This Number Is Even");
		} else {
			System.out.println("This Number Is Odd");

		}

	}
}