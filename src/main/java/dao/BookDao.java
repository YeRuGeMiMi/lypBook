package dao;

import model.Book;

import java.util.List;
import java.util.Map;

/**
 * 书籍
 * Created by lyp on 2015/1/19 0019.
 */
public interface BookDao {

    /**
     * 增加书籍
     */
    public int add(Book book);

    /**
     * 获取书籍
     * @param keys
     * @return
     */
    public List<Book> getBookList(Map<String,String> keys);

    public boolean delBook(int bid);
}
