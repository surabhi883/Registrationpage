package basicjava;

import com.sun.java.util.jar.pack.Instruction.Switch;


public class Looping {

	public void mq() {
		System.out.println("MQ Started......");
	}	
	
}








public void mq() {				// void --> means u shud not return a value
	System.out.println("MQ Started..");	 // will be printed..
	for(int i=0;i<10;i++) {
		if(i==3) {
			return;					// loop will break here  --> always function chya baher--> all loops breaks
		}
		System.out.println("Value :"+i);	// 0 1 2
	}
	System.out.println("MQ Completed..");
}


//forloop --> if..else --> && --- OR --> break --> Continue--> 

static public void pyramid() {
	for(int i=0;i<5;i++) {	// 5 times
		for(int j=0;j<5;j++) {		// 25 times
			if((i==0 && (j==0 || j==4)) || (i==4 && (j==0 || j==4)) || (i==2 && j==2) ) {
				System.out.print("  \t");
				//System.out.print(i+":"+j +"\t"); // 25 times is the correct ans
			}
			else if((i+j)%2==0) {
				System.out.print("**\t");
			}else {
				System.out.print("  \t");
				//System.out.print(i+":"+j +"\t"); // 25 times is the correct ans
			}
		}
		System.out.println();
	}
}



//cross
static public void customM1() {
	for(int i=0;i<5;i++) {	// 5 times
		for(int j=0;j<5;j++) {		// 25 times
			if(i==j || i+j==4) {
				System.out.print("**\t");
			}else {
				System.out.print("  \t");
				//System.out.print(i+":"+j +"\t"); // 25 times is the correct ans
			}
		}
		System.out.println();
	}
}


	static public void customM2() {
		for(int i=0;i<5;i++) {	// 5 times
			for(int j=0;j<5;j++) {		// 25 times
				if(i==3 && j==2) {
					break;
				}
				System.out.print(i+":"+j +"\t\t"); // 25 times is the correct ans
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//customM1();
		pyramid();
	}