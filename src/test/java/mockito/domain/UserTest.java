package mockito.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@JsonTest
public class UserTest {
    private User user;

    @Autowired
    private JacksonTester<User> json;

    @Before
    public void setUp() throws Exception {
        User user = new User("user", "Jack", "Frost", "jfrost@example.com");
        user.setId(0L);
        user.setCreatedAt(12345L);
        user.setLasmodified(12346L);
        this.user = user;
    }

    @Test
    public void deserializerJson() throws IOException {
        String content = "{\n" +
                "  \"username\":\"user\",\n" +
                "  \"firstName\":\"Jack\",\n" +
                "  \"lastName\":\"Frost\",\n" +
                "  \"email\":\"jfrost@example.com\"\n" +
                "}";
        assertThat(this.json.parse(content))
                .isEqualTo(new User("user", "Jack", "Frost", "jfrost@example.com"));
        assertThat(this.json.parseObject(content).getUsername())
                .isEqualTo("user");
    }
}