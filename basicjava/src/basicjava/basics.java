package basicjava;

import java.util.Scanner;

public class basics {
	static void multiplcation() {
		int a = 20;
		int b = 2;
		int c = a * b;
		System.out.println("multiplcation of " + a + " and " + b + " is : " + c);

	}

	public void addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("addition of " + a + " and " + b + " is : " + c);
	}

	public void division() {
		int a = 20;
		int b = 2;
		int c = a / b;
		System.out.println("division of " + a + " and " + b + " is : " + c);

	}

	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		basics operations = new basics();
		operations.addition();
		operations.division();
		basics.multiplcation();
		Scanner myScan = new Scanner(System.in);
		System.out.println("enter first no");
		int a =              myScan.nextInt();
		System.out.println("enter second no");
		int b = myScan.nextInt();
		int c = a + b;
		System.out.println("answer is " + c);

	}

}
