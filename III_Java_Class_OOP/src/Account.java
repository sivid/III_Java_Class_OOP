// textbook p.41
public class Account {
	String accountNo;
	double balance;
	
	Account(String accountNo, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	private void printAccData(){
		System.out.println("account number is " + accountNo);
		System.out.println("balance is " + balance);
	}
	
	public static void main(String[] args) {
		Account acc1 = new Account("1324", 12314);
		acc1.printAccData();
	}

}
