import com.spring.dao.UserDaoMysqlImpl;
import com.spring.dao.UserDaoOracleImpl;
import com.spring.pojo.Hello;
import com.spring.service.UserService;
import com.spring.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: Spring5study
 * @Package: PACKAGE_NAME
 * @ClassName: MyTest
 * @Author: 张晟睿
 * @Date: 2022/1/20 17:10
 * @Version: 1.0
 */
public class MyTest {
    @Test
    void test1(){
        UserService userService = new UserServiceImpl();
        userService.getuser();
    }

    @Test
    public void test2(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao( new UserDaoMysqlImpl() );
        service.getuser();
        //那我们现在又想用Oracle去实现呢
        service.setUserDao( new UserDaoOracleImpl() );
        service.getuser();
    }

    @Test
    public void test3(){
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello"); hello.show();
    }
    @Test
    public void test4() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl)
                context.getBean("ServiceImpl");
        serviceImpl.getUserDao().getuser();
    }
}
