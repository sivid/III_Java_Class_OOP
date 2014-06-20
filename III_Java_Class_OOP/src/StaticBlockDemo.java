public class StaticBlockDemo {
	int num;
	static int count;
	static{
		count = 10;
	} // static block
	public static void main(String[] args) {
		//num++;
		count++;
	}

}
