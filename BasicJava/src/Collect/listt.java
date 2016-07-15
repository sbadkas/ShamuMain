package Collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class listt {

	public static void main(String[] args)
	{
		List<String> obj = new ArrayList<>();
		obj.add("Sharmila");
		obj.add("Bhardwaj");
		obj.add("Some");
		obj.add("more");
		for (String i:obj)
		{
			System.out.println(i);
		}
		
		
		List objj = new Vector();
		objj.add("sorted");
		objj.add("order");
		objj.add("only");
		Iterator it = objj.iterator();
		
	while (it.hasNext())
	{
		System.out.println(it.next());
	}
		
		
		
		
		
		
		
		
	}
}
