package homework_3;

public class EmployeeMain{
	public static void main(String[] chickens){
		Employee[] e = new Employee[6];
		
		e[0] = new Staff("Comcast", 'M', "19990405", "0911345671", "somewhereInUkraine", 100000);
		e[1] = new Staff("Elizabeth", 'F', "19940305", "0922456721", "somewhereInPoland", 100000);
		e[2] = new T2_Exec("Booker", 'M', "19830402", "0933354654", "somewhereInRome", 100000);
		e[3] = new T2_Exec("Tifa", 'F', "19930402", "0944354654", "somewhereInPortugual", 100000);
		e[4] = new T1_Exec("Cloud", 'M', "19880402", "0955354654", "somewhereInPlanet", 100000);
		e[5] = new T1_Exec("Montezuma", 'M', "11130402", "0966354654", "somewhereInSouthAmerica", 100000);
		
		for (int i=0; i<e.length; i++){
			System.out.println("Name: " + e[i].getName() + "  Gender: " + e[i].getGender()
								+ "  On board date: " + e[i].getOnboardDate() + "  Phone " + e[i].getPhoneNumber()
								+ "  Address: " + e[i].getAddress());
			System.out.println("This month's money: " + e[i].getFinalMoney((i%2==0?0:10)));
		}
	}
}