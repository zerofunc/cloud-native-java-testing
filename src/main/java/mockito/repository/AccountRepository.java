package mockito.repository;

import mockito.domain.Account;

import java.util.Collections;
import java.util.List;

public class AccountRepository {
	public List<Account> findAccountsByUsername(String user) {
		return Collections.emptyList();
	}
}
