package Stacking;

public class ReverseString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOperations s = new StackOperations(8);
		String orig = "Sharmila";
		
		for(int i = 0 ; i < orig.length(); i++){
			s.push(orig.charAt(i));
		}

		for(int i = 0 ; i < orig.length(); i++){
			System.out.print(s.pop());
			/* // */
			
			
		}
	}

}
