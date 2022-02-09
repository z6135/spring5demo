import com.spring.pojo.Person;
import com.spring.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: Spring5study
 * @Package: PACKAGE_NAME
 * @ClassName: MyTest
 * @Author: 张晟睿
 * @Date: 2022/2/7 11:55
 * @Version: 1.0
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.name);
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.name);
    }
}
