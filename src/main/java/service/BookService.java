package service;

import model.Book;

import java.util.List;
import java.util.Map;

/**
 * Created by lyp on 2015/1/19 0019.
 */
public interface BookService {

    /**
     * 增加书籍
     * @param keys
     * @return
     */
    public boolean addBook(Map<String,Object> keys);

    /**
     * 查询书籍
     * @param keys
     * @return
     */
    public List<Book> getBooks(Map<String,String> keys);

    /**
     * 删除书籍
     * @param bid
     * @return
     */
    public  boolean delBook(int bid);
}
