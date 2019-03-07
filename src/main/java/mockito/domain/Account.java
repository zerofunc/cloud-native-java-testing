package mockito.domain;

public class Account {
	private String userName;
	private AccountNumber accountNumber;
	
	public Account(String user, AccountNumber accountNumber) {
		this.userName = user;
		this.accountNumber = accountNumber;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public AccountNumber getAccountNumber() {
		return accountNumber;
	}
}
