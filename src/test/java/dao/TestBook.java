package dao;

import model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lyp on 2015/1/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestBook {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testAdd(){
        Book book = new Book();
        book.setName("大江大海1949");
        book.setAuthor("龙应台");
        book.setC_num("tw68867766");
        book.setPublishName("台大出版社");
        book.setPublishTime((int)(System.currentTimeMillis()/1000));
        book.setPrice(25.22);

        int i = bookDao.add(book);
        System.out.print(i);
    }

    @Test
    public void testControl(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("keyselect","1");
        map.put("keyword","19");
        List<Book> list = bookDao.getBookList(map);
        System.out.print(list);
    }
}
