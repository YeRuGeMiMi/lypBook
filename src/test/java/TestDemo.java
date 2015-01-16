import dao.UserDao;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yfl on 2015/1/16 0016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestDemo {

    @Autowired
    private UserDao userDao;

    @Test
    public void test(){
        User user = userDao.getUserByLogin("haha","12334");
        System.out.print(user.getUid());
    }
}
