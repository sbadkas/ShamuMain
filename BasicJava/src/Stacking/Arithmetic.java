package Stacking;

public class Arithmetic {
public static void main(String args[]){
	float a = (float)2.33;
	
	
	System.out.println( 4.0 / 0.0); // Prints: Infinity
	System.out.println(-4.0 / 0.0); // Prints: -Infinity
	System.out.println(0.0 / 0.0); // Prints: NaN
	System.out.println("Test" + 2+2); //Prints Test22 and n0t Test4
	
	
	// (1) Prefix order: increment operand before use.
	int i = 10;
	int k = ++i + --i; // ((++i) + (--i)). k gets the value 21 and i becomes 10.
	System.out.println(k);
	
	long i1 = 10;
	long k1 = i1++ + i1--; // ((i++) + (i--)). k gets the value 21L and i becomes 10L.
	System.out.println(k1);
	
	
	
	
	System.out.println(4 / 0); // Prints: Arithmetic Exception, divide by 0
	
}
}
