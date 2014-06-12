class A {
	void m() {
		System.out.println("A");
	}
}

class B extends A{
	void m() {
		System.out.println("B");
	}
}

class ABmain{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.m();
		b.m();
		A cc = new B();
		//B dd = (B)a;   //doesn't work, see textbook p.46
		B dd = (B)cc;
		cc.m();
		dd.m();
		
	}
}