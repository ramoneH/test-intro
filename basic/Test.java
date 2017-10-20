
package basic;

public class Test {
	
	public static void main(String[] args) {
		gradeStudent(65);
		
	}

	
	
	 static void gradeStudent(int studentScore) {

		//if studentScore is 50-60 print grade D
		if (studentScore >= 50 && studentScore < 60) {
			System.out.println("Grade D");
		}
		
		//if studentScore is 61-70 print grade C
		else if (studentScore >= 60 && studentScore < 70) {
			System.out.println("Grade C");
		}
		
		//if studentScore is 71-80 print Grade B
		else if(studentScore >= 70 && studentScore < 80) {
			System.out.println("Grade B");
		}
		
		//if studentScore is 81-100 print Grade A
		else if(studentScore >= 80 && studentScore <= 100) {
			System.out.println("Grade A");
		}
		
		else {
			System.out.println("You Did Not PASS the class. "
					+ "Please remove Yourself And TRY TRY TRY "
					+ "Again . but WHY ? you Failed");
		}
		
	 }
		
	
		
		

	

}
