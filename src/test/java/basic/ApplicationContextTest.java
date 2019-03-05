package basic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationContextTest {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void contextLoads() {
		Assert.assertNotNull("the application context should have loaded", this.applicationContext);
	}
}