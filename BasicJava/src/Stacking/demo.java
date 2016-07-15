package Stacking;

public class demo {

	static char[] stk;
	int top = -1;
	
	public demo(int limit){
		stk = new char[limit];
		
	}
			
	public void push(char pushme)
	{
		stk[++top] = pushme;
		//System.out.println(stk[top]);
	}
	
	public char popme()
	{
		char temp = stk[top--];
		//System.out.println(temp);
		return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit  = 3;
		demo d = new demo(limit);
		d.push('a');
		d.push('b');
		d.push('c');
			for (int i = 0; i< limit; i++)
			{
				System.out.println(stk[i]);
			}
			
			d.popme();
			d.popme();
			
			String str = "Sharmila";
			int len = str.length();
			char[] newArr = new char[len];
			//int top = len-1;
			//int j = 0;
			for (int top = len-1 ; top >= 0; top--)
			{
				
				str = str + str.charAt(top);
				//System.out.print(str);
				//j++;
				
			}
			System.out.println(str.substring(len));
	}

}
