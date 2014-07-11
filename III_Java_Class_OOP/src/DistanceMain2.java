
public class DistanceMain2 {
	public static void main(String[] args) {
		Distance dd = new Distance();
		try{
			dd.setInch(13);
			dd.setFeet(33);
		}catch(OverInchException e){
			e.printMsg();
		}
		System.out.println("feet is " + dd.getFeet());
		System.out.println("inch is " + dd.getInch());
		
	}
}
