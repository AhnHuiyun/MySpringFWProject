package mylab.notification.di.annot.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mylab.notification.di.annot.NotificationManager;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = NotificationConfig.class)
public class NotificationConfigTest {
	@Autowired
	NotificationManager notificationManager;
	
	@Test
    void testNotificationManager() {
		notificationManager.sendNotificationByEmail("이메일 테스트");
        notificationManager.sendNotificationBySms("SMS 테스트");
    }
}
