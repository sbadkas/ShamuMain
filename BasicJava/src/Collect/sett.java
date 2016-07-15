package Collect;

import java.util.LinkedHashSet;
import java.util.Set;

public class sett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new LinkedHashSet();
		s.add("Shamu");
		s.add("Shamu");
		s.add("Shamu");
		
		for(Object i : s)
			System.out.println(i);
	}

}
