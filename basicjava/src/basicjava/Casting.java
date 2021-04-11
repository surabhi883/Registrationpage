package basicjava;

public class Casting {
	public void implicitCast(){
		int intValue = 10;
		float longValue = intValue;//automatic type conversion
		System.out.println("implicitCast value is "+longValue);
	}
	
	
	public void explicitCast(){
		double intValue = 20.02;
		byte byteValue = (byte) intValue;//explicit type casting
		System.out.println("explicitCast value is "+byteValue);
	}
	
	//Autoboxing example of int to Integer  
	public void WrapperExample1() {
		//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);  
	}
	
	//Unboxing example of Integer to int  
	public void WrapperExample2() {
		//Converting Integer to int 
		Integer a=new Integer(3);    
		int i=a.intValue();//converting Integer to int explicitly  
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j); 
	}
	public static void main(String[] args) {
		Casting d = new Casting();
		d.implicitCast();
		d.explicitCast();
		d.WrapperExample1();
		d.WrapperExample2();
		

	}

}


