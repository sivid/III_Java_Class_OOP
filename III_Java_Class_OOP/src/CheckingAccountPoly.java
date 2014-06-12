public class CheckingAccountPoly extends AccountPoly{
	int checkCount = 0;
	
	public CheckingAccountPoly(String accountNo, double balance, int checkCount) {
		super(accountNo, balance);
		this.checkCount = checkCount;
	}
	
	void printAccData(){
		super.printAccData();
		System.out.println("checkcount is " + checkCount);
	}
}
