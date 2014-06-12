public class CheckingAccount extends Account{
	int checkCount = 0;
	
	public CheckingAccount(String accountNo, double balance, int checkCount) {
		super(accountNo, balance);
		this.checkCount = checkCount;
	}
	
	void printAccData(){
		super.printAccData();
		System.out.println("checkcount is " + checkCount);
	}
}
