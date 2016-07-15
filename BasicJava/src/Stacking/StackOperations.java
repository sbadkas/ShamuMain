package Stacking;

public class StackOperations {

	public int stackTop;
	char[] stk; 
	
	public StackOperations(int len){
		stackTop = -1;
		stk = new char[len];
	}
	
	public void push(char pushMe){
		stk[++stackTop] = pushMe;
		//stackTop++;
		//System.out.println("pushed " + pushMe);
	}
	
	public char pop()
	{
		char popMe = stk[stackTop--];
		return popMe;
	}
	
	public void printStack1(){
		for(int i = 0 ; i <= stackTop ; i++ ){
		System.out.println("printing " + stk[i]);
		}
		//System.out.println("hello");
	}
	
	
	public static void main(String[] args) {
		StackOperations s = new StackOperations(3);
		s.push('a');
		s.push('b');
		s.push('c');
		s.printStack1();
		s.pop();
		s.pop();
		s.printStack1();
		

	}

}
