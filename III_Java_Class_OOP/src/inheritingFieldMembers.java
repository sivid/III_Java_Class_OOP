public class inheritingFieldMembers extends inheritingFieldParent{
	int a = 5;
	public inheritingFieldMembers() {
	}
	
	public void printStuff(){
		System.out.println("I'm the child");
		System.out.println(super.a);
	}
	public static void main(String[] chicken){
		inheritingFieldParent aa = new inheritingFieldMembers();
		System.out.println(aa.a);
		inheritingFieldMembers bb = new inheritingFieldMembers();
		System.out.println(bb.a);
		aa.printStuff();
		bb.printStuff();
		
	}
}