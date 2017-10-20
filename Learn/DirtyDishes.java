package Learn;

public class DirtyDishes {

	public static void main(String[] args) {
		System.out.println(" See If You Can WASH"
				+"\n"+" MY Dirty Dirty Dishes");
			
		// TODO Auto-generated method stub
		for(int r=10;r>=0;r--) {
			if(r==3||r==4||r==6) {
				continue;
				
			}
			System.out.println("          "+r);
		}
	}

}
