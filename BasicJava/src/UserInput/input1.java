package UserInput;

import java.util.Scanner;

public class input1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		System.out.println("You Enterred : " + num);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter String: ");
		String in  = scan1.nextLine();
		System.out.println("You Entered : " + in);
		
		Scanner s = new Scanner(System.in);
		String nxt = s.nextLine();
		System.out.println("Next line is "+nxt);

	}

}
