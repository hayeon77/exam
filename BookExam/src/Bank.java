
public class Bank {
	private Account[] accounts;
	private int totalAccount;
	public String accountNo;
	public String name;
	
	
	
public String addAccount(String accountNo, String name) {
	this.name=name;
	return name;
}

public String getAccount(String accountNo) {
	this.accountNo=accountNo;
	return accountNo;
}
public Account[] findAccounts(String name) {
	this.name=name;
	return null;
}
	
public Account[] getAccounts() {
	return accounts;
	
}

public int getTtotalAccount() {
	return totalAccount;
	
}	
}	
