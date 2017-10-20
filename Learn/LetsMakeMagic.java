package Learn;

public class LetsMakeMagic {

	public static void main(String[] args) {
			/*THIS PROGRAM CHECKS NUMBERS
			 * IN LIST NUM1 & LIST NUM2 
			 * TO CHECK EACH NUMBER FROM THE 
			 * FIRST ARRAY TO THE SECOND ARRAY
			 */
		
		int[] num1= {23,45,12,455,8,4,1,131,1,};
		int[] num2= {4,7,89,1,97,4,68,64,8,};
		
		for (int a=0;a<num1.length;a++) {
		for (int b=0;b<num2.length;b++) {
			if(num1[a]==num2[b]) {
				System.out.println(num1[a]);
			}
		}
		}
	}
	
		
	

}
