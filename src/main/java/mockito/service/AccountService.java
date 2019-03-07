package mockito.service;

import mockito.domain.Account;
import mockito.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
	private AccountRepository accountRepository;
	private UserService userService;
	
	@Autowired
	public AccountService(AccountRepository accountRepository, UserService userService) {
		this.accountRepository = accountRepository;
		this.userService = userService;
	}
	
	public List<Account> getUserAccounts() {
		return Optional.ofNullable(userService.getAuthenticatedUser())
				.map(u  -> accountRepository.findAccountsByUsername(u.getUsername()))
				.orElse(Collections.emptyList());
	}
}
