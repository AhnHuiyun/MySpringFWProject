package mylab.user.di.annot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:mylab-user-di.xml")
public class UserServiceTest {
	@Autowired
	UserService userSerivce;
	
	@Test
	void testUserService() {
		// UserService의 레퍼런스가 Not Null 인지 검증
		assertNotNull(userSerivce);

        // userService.getRepository() 가 Not Null 인지 검증
        assertNotNull(userSerivce.getUserRepository());

        // userService.getRepository().getDbType() 값이 MySQL 인지 값을 비교하기
        assertEquals("MySQL", userSerivce.getUserRepository().getDbType());

        // userService.getSecurityService() 가 Not Null 인지 검증
        assertNotNull(userSerivce.getSecurityService());

        // userService.registerUser() 메서드가 True 인 검증
        assertTrue(userSerivce.registerUser("u0001", "홍길동", "1234"));
	}
}
