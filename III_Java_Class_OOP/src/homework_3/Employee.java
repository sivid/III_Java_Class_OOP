/* Employee: name, gender, onboardDate, phoneNumber, address
 * Staff: Employee, salary
 * T2_exec: Staff, lunch 1800, positionPay 3000 
 * T1_exec: Staff, lunch 1800, positionPay 5000, transportExpenses 2000
 *  
 */
package homework_3;

abstract class Employee {
	private String name;
	private char gender;
	private String onboardDate;
	private String phoneNumber;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getOnboardDate() {
		return onboardDate;
	}
	public void setOnboardDate(String onboardDate) {
		this.onboardDate = onboardDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	abstract public double getFinalMoney(double overtimeHours);
	/**
	 * @param name
	 * @param gender
	 * @param onboardDate
	 * @param phoneNumber
	 * @param address
	 */
	public Employee(String name, char gender, String onboardDate, String phoneNumber, String address) {
		setName(name);
		setGender(gender);
		setOnboardDate(onboardDate);
		setPhoneNumber(phoneNumber);
		setAddress(address);
		//System.out.println("Employee constructor!");
	}
	
} // end class Employee

class Staff extends Employee{
	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @param name
	 * @param gender
	 * @param onboardDate
	 * @param phoneNumber
	 * @param address
	 * @param salary
	 */
	public Staff(String name, char gender, String onboardDate,
			String phoneNumber, String address, double salary) {
		super(name, gender, onboardDate, phoneNumber, address);
		setSalary(salary);
	}
	
	public double getFinalMoney(double overtimeHours){
		if (overtimeHours != 0)
				return salary/240*1.5*overtimeHours+salary;
		else
			return salary;
	}	// this method should not be inherited, but I've found no ways to force children to override it.  Interface?
} // end class Staff

class T2_Exec extends Staff {
	protected int lunchPay = 1800;
	protected int positionPay = 3000;			// because some ppl get more
	public T2_Exec(String name, char gender, String onboardDate,
			String phoneNumber, String address, int salary){
		super(name, gender, onboardDate, phoneNumber, address, salary);
		// setSalary(salary);
	}
	public double getFinalMoney(double overtimeHours){
		return super.getFinalMoney(overtimeHours) + lunchPay + positionPay;		
	}
} // end class T2_exec

class T1_Exec extends T2_Exec {
	protected int positionPay = 5000;
	protected int transportExpenses = 2000;
	/**
	 * @param name
	 * @param gender
	 * @param onboardDate
	 * @param phoneNumber
	 * @param address
	 * @param salary
	 */
	public T1_Exec(String name, char gender, String onboardDate,
			String phoneNumber, String address, int salary) {
		super(name, gender, onboardDate, phoneNumber, address, salary);
	}
	public double getFinalMoney(double overtimeHours) {
		return super.getFinalMoney(overtimeHours) + (positionPay - super.positionPay) + transportExpenses;
	}
} // end class T1_exec

