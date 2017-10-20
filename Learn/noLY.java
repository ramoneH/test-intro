package Learn;

import java.util.Scanner;

public class noLY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter A word");
		String word = new Scanner(System.in).next();
		if (word.length()>1) {
			if(word.substring(word.length()-2).equals("ly")){
			System.out.println("This Word Ends In LY");
			}
			else if(!word.substring(word.length()-2).equals("ly") ) {
				System.out.println("This Word Doesn't End In LY");
			}
		}
			else {
				System.out.println("Word Isnt Long Enough");
			}


}
}