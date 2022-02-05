import com.spring.pojo.Student;
import com.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

/**
 * @ProjectName: Spring5study
 * @Package: PACKAGE_NAME
 * @ClassName: MyTest
 * @Author: 张晟睿
 * @Date: 2022/2/2 12:57
 * @Version: 1.0
 */
public class MyTest {
    @Test
    public void test1(){
         ApplicationContext context= new
                 ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        * Student{name='厂长', address=Address{address='山西'},
        * course=[数据结构, 数据库原理, 操作系统, 计算机网络],
        * hobbies=[打游戏, 敲代码, 旅游],
        * books={10001=面向对象程序设计A, 10002=面向对象程序设计B, 10003=操作系统与组成原理},
        * games=[LOL, CF, 梦三国],
        * girlfriends='null',
        * info={password=123456, url=jdbc:mysql://localhost:3306?test, driver=com.mysql.jdbc.Driver, username=root}}
        *
        * */
    }
    @Test
    public void test02() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user==user2);
        HashMap<String, String> stringStringHashMap = new HashMap<>();
    }
}
