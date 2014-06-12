// textbook p.48
public class AccountPoly {
	String accountNo;
	double balance;
	AccountPoly(){
	}
	
	AccountPoly(String accountNo, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	void printAccData(){
		System.out.println("account number is " + accountNo);
		System.out.println("balance is " + balance);
	}
	
	public static void main(String[] args) {
		AccountPoly acc1 = new AccountPoly("1324", 12314);
		acc1.printAccData();
		CheckingAccount acc2 = new CheckingAccount("87874", 56754, 20);
		acc2.printAccData();
		
		System.out.println("=======WE USE POLY BELOW=========================");
		
		AccountPoly[] a = new AccountPoly[2];
		a[0] = new AccountPoly("1324", 12314);
		a[1] = new CheckingAccountPoly("87874", 56754, 20);
		for (int i=0; i<a.length; i++){
			a[i].printAccData();
		}
	}

}
