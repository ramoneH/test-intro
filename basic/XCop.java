package basic;

public class XCop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orig = 42;
		XCop x = new XCop();
		int y = x.go(orig);
		System.out.println(orig + " " + y);
	}
	int go(int arg) {
		arg=arg * 2;
		return arg;
	}
}
