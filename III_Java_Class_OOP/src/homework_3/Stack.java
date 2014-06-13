// http://www.tutorialspoint.com/java/java_exceptions.htm

package homework_3;
class StackEmptyException extends Exception{
	private int top;
	public StackEmptyException(int top){
		this.top = top;
	}
	public int getTop(){
		return top;
	}
}
class StackFullException extends Exception{
	private int top;
	public StackFullException(int top){
		this.top = top;
	}
	public int getTop(){
		return top;
	}
}

public class Stack {
	int[] stack = new int[10];
	int top = -1;		// when top=-1, stack is empty, normal
	
	public void push(int data) throws StackFullException {
		if (top >= stack.length-1){		// stack will explode if we don't do something
			throw new StackFullException(top);
		}
		stack[++top] = data;
		System.out.println("push, stack[" + top + "] = " + data);
	}
	public int pop() throws StackEmptyException {
		if (top <= -1) {
			throw new StackEmptyException(top);
		}
		System.out.println("pop, stack[" + top + "] = " + stack[top]);
		return stack[top--];
	}	
	public static void main(String[] chickens) {
		Stack stack1 = new Stack();
		try{
			for (int i=0; i<3; i++){
				stack1.push(4);
			}
		} catch(StackFullException e1){
			System.out.println("===================stack is exploding!====================");
			System.out.println("top is " + e1.getTop());
			e1.printStackTrace();
		}
		System.out.println("~~~~~~~~~top  =  " + stack1.top);
		try{
			for (int i=0; i<35; i++){
				stack1.pop();
			}
		} catch(StackEmptyException e2){
			System.out.println("s===================stack is imploding!====================");
			System.out.println("top is " + e2.getTop());
			e2.printStackTrace();
		}
		
		System.out.println("%%%%%%%%%%%%%%top  =  " + stack1.top);
		
	}
}
