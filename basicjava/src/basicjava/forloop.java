package basicjava;

public class forloop {


public static class FlowControles {
	public void forLoop() {
		int j = 5;
		int k = 8;
		
		for(int i =0;i<=5;i++) {
			System.out.println("value of i = "+i);
			
		}
		for(int i =10;i>5;i--) {
			System.out.println("value of i = "+i);
			
		}
		
		if(j==3 && k ==4) {
			System.out.println("inside if block");
		}else {
			System.out.println("inside else block");
		}
		
	}
	public static void main(String[] args) {
		FlowControles fl = new  FlowControles();
		fl.forLoop();

	}
}

}
