
public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private Transaction[] transactions;

	public void deposit(long amount) {
		this.balance = amount;
	}

	public void withdraw(long amount) {
		this.balance = amount;

	}

	public long getBalance;

	public Transaction[] getTransaction() {
		return transactions;

	}
}
