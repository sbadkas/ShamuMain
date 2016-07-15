package Misc;

public class fnal {

	public final int i = 10;
	
	public final void method(){
		
		System.out.println("Parent method");

	}
	public void method(int a){
		System.out.println("Subclass method");
	}
}

class child extends fnal{
	
	
	
	
	public static void main(String[] args){
		
		child c = new child();
		c.method();
	}
}