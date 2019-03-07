package mockito.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.util.Assert;

import java.util.Objects;

public class AccountNumber {
	private String accountNumber;
	public AccountNumber(String accountNumber) {
		Assert.notNull(accountNumber, "Account Number must not be null");
		Assert.isTrue(accountNumber.length() == 9, "Account NUmber must be exactly 9 characters");
		this.accountNumber = accountNumber;
	}
	
	@JsonValue
	public String getAccountNumber() {
		return accountNumber;
	}
	
	@Override
	public String toString() {
		return "AccountNumber{" +
				"accountNumber='" + accountNumber + '\'' +
				'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AccountNumber that = (AccountNumber) o;
		return Objects.equals(accountNumber, that.accountNumber);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(accountNumber);
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
