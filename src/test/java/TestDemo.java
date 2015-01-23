import dao.UserDao;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

/**
 * Created by lyp on 2015/1/16 0016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestDemo {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        User user = userService.login("wolequ","16");
        System.out.print(user);
    }
}
