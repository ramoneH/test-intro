package basic;

public class DataTypeExample {

	public static void main(String[] args) {
		bark();
		printANumber(40);
		printMyMood(true);
		

	}
	
	 static void bark() {
		 System.out.println("bow wow");
	 }

	
	 static void printANumber(int a) {
		
		System.out.println(a);
		
	}
	 
	 static void printMyMood(boolean b) {
		 if(b) {
			 System.out.println("My mood is fineeeee");
		 }
		 
		 else {
			 System.out.println("I am pissed");
		 }
	 }
	 
	
}
