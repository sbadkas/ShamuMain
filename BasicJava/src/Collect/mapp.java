package Collect;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class mapp {

	public static void main(String [] args)
	{
		
		Map m = new LinkedHashMap();
		m.put("a", 1);
		m.put("b", 2);
		m.put("c", 3);
		
		Set keys = m.keySet();
		for (Object i : keys)
		System.out.println(m.get(i));
	}
}
