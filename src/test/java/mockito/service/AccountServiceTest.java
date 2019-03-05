package mockito.service;

import mockito.domain.Account;
import mockito.domain.AccountNumber;
import mockito.domain.User;
import mockito.repository.AccountRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
public class AccountServiceTest {
	@MockBean
	private UserService userService;
	
	@MockBean
	private AccountRepository accountRepository;
	
	private AccountService accountService;
	
	@Before
	public void before() {
		accountService = new AccountService(accountRepository, userService);
	}
	
	@Test
	public void getUserAccountsReturnsSingleAccount() {
		given(this.accountRepository.findAccountsByUsername("user"))
				.willReturn(
						Collections.singletonList(
								new Account("user", new AccountNumber("123456789"))));
		
		given(this.userService.getAuthenticatedUser())
				.willReturn(new User(0L, "user", "John", "Doe"));
		
		List<Account> actual = accountService.getUserAccounts();
		
		assertThat(actual).size().isEqualTo(1);
		assertThat(actual.get(0).getUserName()).isEqualTo("user");
		assertThat(actual.get(0).getAccountNumber()).isEqualTo(new AccountNumber("123456789"));
	}
}