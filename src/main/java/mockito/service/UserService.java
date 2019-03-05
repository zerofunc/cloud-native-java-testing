package mockito.service;

import mockito.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private User authenticatedUser;
	
	public User getAuthenticatedUser() {
		return authenticatedUser;
	}
}
