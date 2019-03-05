package mockito.service;

import mockito.domain.Account;
import mockito.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AccountService {
	private AccountRepository accountRepository;
	private UserService userService;
	
	public AccountService(AccountRepository accountRepository, UserService userService) {
		this.accountRepository = accountRepository;
		this.userService = userService;
	}
	
	public List<Account> getUserAccounts() {
		return accountRepository.findAccountsByUsername("user");
	}
}
