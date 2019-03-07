package mockito.repository;

import mockito.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface  UserReppository extends JpaRepository<User, Long> {
    User findUserByUsername(@Param("username") String usernmae);
}
