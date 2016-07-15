package Stacking;

public class ReverseStringNoTemp {

	public static void main(String[] args) {
		String str = "Sharmila";
		int len = str.length();
		
		for(int i = (len-1); i>=0; i--)
		{
			str = str + str.charAt(i);
			
		}
		str = str.substring(len);
		System.out.println(str);
		
	}

}
