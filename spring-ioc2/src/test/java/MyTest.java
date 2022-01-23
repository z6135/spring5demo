import com.spring.pojo.User;
import com.spring.pojo.UserT;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: Spring5study
 * @Package: PACKAGE_NAME
 * @ClassName: MyTest
 * @Author: 张晟睿
 * @Date: 2022/1/23 22:01
 * @Version: 1.0
 */
public class MyTest {
    @Test
    public void test(){ ApplicationContext context = new
            ClassPathXmlApplicationContext("bean.xml");
        //在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("user");
        //调用对象的方法 .
        user.show();
    }

    @Test
    public void testT() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");
        UserT user = (UserT) context.getBean("userT");
        user.show();

    }
}
