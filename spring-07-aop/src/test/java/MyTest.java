import com.aop.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: Spring5study
 * @Package: PACKAGE_NAME
 * @ClassName: MyTest
 * @Author: 张晟睿
 * @Date: 2022/2/9 21:11
 * @Version: 1.0
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.select();

    }

    @Test
    public void test2() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans2.xml");
        UserService userService = (UserService)
                context.getBean("userService");
        userService.add();

    }

    @Test
    public void test3() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans3.xml");
        UserService userService = (UserService)
                context.getBean("userService");
        userService.delete();

    }
}
