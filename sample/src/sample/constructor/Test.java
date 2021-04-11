package sample.constructor;

public class Test {

	public Test(double d) {
		this(10);
		System.out.println("in double");
		
		
	}
	public Test(int i) {
		this();
		System.out.println("in int");
		
		
	}
	public Test() {

		System.out.println("in no arg");
		
		
	}
	public static void main(String [] args) {
	Test t1= new Test(9.3);
//	Test t2= new Test(7);
//	Test t3= new Test();
	}
}
