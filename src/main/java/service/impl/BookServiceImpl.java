package service.impl;

import common.Tools;
import dao.BookDao;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BookService;

import java.util.List;
import java.util.Map;

/**
 * Created by lyp on 2015/1/19 0019.
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    /**
     * 增加书籍
     * @param keys
     * @return
     */
    @Override
    public boolean addBook(Map<String, Object> keys) {
        Book book = new Book();
        book.setName((String)keys.get("name")); //书名
        book.setAuthor((String)keys.get("author")); //作者
        book.setC_num((String)keys.get("c_num"));  //分类号
        book.setPublishName((String)keys.get("publishName"));  //出版单位

        //传入时间戳
        book.setPublishTime(Tools.dateStr2Timetamp((String)keys.get("publishTime"),"yyyyMMdd"));
        //价格
        book.setPrice((Double)keys.get("price"));

        int i = bookDao.add(book);
        if(i > 0){
            return true;
        }

        return false;
    }

    /**
     * 查询书籍服务
     * @param keys
     * @return
     */
    @Override
    public List<Book> getBooks(Map<String, String> keys) {
        return bookDao.getBookList(keys);
    }

    /**
     * 删除图书
     * @param bid
     * @return
     */
    @Override
    public boolean delBook(int bid) {
        return bookDao.delBook(bid);
    }
}
