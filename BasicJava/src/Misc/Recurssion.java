package Misc;

public class Recurssion {

	public static long fact(long n)
	{
		if(n <=1)
			return 1;
		else
			return (n * fact(n-1));
	}
	
	public static void main(String arngs[]){
		System.out.println(fact(6));
	}
}
