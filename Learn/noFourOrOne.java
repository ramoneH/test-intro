package Learn;

public class noFourOrOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lets check for a 1 OR 4");
		int [] numbers = {1,9,564,1,3,10,3,14,4,344,4,4,3,31,1};
		int ones = 0;
		int fours = 0;
		for (int number : numbers) {
		if(number == 1) {
			ones++;
		}
		else if(number == 4) {
			fours++;
		}
		
 	}
		System.out.println("there are " + ones + "Ones");
		System.out.println("there are " + fours + "Fours");
		
	}
	
}
