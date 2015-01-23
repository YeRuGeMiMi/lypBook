package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lyp on 2015/1/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestBook {

    @Autowired
    private BookService bookService;

    @Test
    public void testAddBook(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name","1984");
        map.put("author","乔治·奥威尔");
        map.put("c_num","xy65076987");
        map.put("publishName","上海出版社");
        map.put("publishTime","19490608");
        map.put("price",22.50);

        boolean bool = bookService.addBook(map);
        System.out.print(bool);
    }
}
