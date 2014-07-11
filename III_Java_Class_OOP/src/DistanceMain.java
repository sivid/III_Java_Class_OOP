public class DistanceMain {

	public static void main(String[] args) {
		Distance dd = null;
		try{
			dd = new Distance(5,13);
			System.out.println("feet is " + dd.getFeet());
			System.out.println("inch is " + dd.getInch());
		}catch(OverInchException e){
			e.printMsg();
		}
		/*
		 * can't put these two lines here, because they're supposed to appear IFF dd is successfully new-ed. 
		System.out.println("feet is " + dd.getFeet());
		System.out.println("inch is " + dd.getInch());
		*/
	}

}
