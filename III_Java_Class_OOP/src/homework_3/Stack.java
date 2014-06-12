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
	public int top = -1;		// when top=-1, stack is empty, normal
	
	public void push(int data) throws StackFullException {
		if (top==stack.length-1){		// stack will explode if we don't do something
			throw new StackFullException(top);
		}
		stack[++top] = data;
		System.out.println("push, stack[" + top + "] = " + data);
	}
	public int pop(){
		System.out.println("pop, stack[" + top + "] = " + stack[top]);
		return stack[top--];
	}	
	public static void main(String[] chickens) {
		Stack stack1 = new Stack();
		try{
			stack1.push(1);
			stack1.push(2);
			stack1.push(3);
			stack1.push(4);
			stack1.push(5);
		} catch(StackFullException e1){
			System.out.println("stack is exploding!");
			e1.printStackTrace();
		}
		System.out.println("===========" + stack1.top);
		try{
			stack1.pop();
			stack1.pop();
			stack1.pop();
			stack1.pop();
			stack1.pop();
			stack1.pop();
			stack1.pop();
			stack1.pop();
		} catch(ArrayIndexOutOfBoundsException eee){
			System.out.println("exception thrown: " + eee);
			//throw eee;
		}
		
		System.out.println("===========" + stack1.top);
		
	}
}
