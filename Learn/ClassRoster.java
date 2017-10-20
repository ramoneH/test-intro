package Learn;

public class ClassRoster {

	public static void main(String[] args) {
		 String [] listofnames = {"tracy", "bob", "doe","joe","sam"};
		 findJoeStopPrint(listofnames);
		 
		    
}

	static void findJoeStopPrint(String[] listofnames) {
		for(String name : listofnames ) {
			if(name.equals("joe")) {
				continue;
			}
			System.out.println(name);
		}
		
	}

}