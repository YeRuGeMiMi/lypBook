package dao.impl;

import dao.BookDao;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by lyp on 2015/1/19 0019.
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao{

    @Autowired
    private JdbcTemplate jdbc;

    /**
     * 增加图书的实现
     * @param book
     * @return
     */
    @Override
    public int add(Book book) {
        String sqlStr = "INSERT INTO book (name,author,c_num,publishName,publishTime,price) " +
                        "VALUES(?,?,?,?,?,?)";
        int i = jdbc.update(sqlStr,new Object[]{book.getName(),book.getAuthor(),book.getC_num(),
                    book.getPublishName(),book.getPublishTime(),book.getPrice()});
        return i;
    }

    /**
     * 删除书籍实现
     * @param bid
     * @return
     */
    @Override
    public boolean delBook(int bid) {

        boolean flag = false;
        int i = jdbc.update("delete from book where bid=? ",new Object[]{bid});
        if(i>0){
            flag = true;
        }
        return flag;
    }

    /**
     * 查询图书的实现
     * @param keys
     * @return
     */
    @Override
    public List<Book> getBookList(Map<String, String> keys) {
        String sqlStr = "SELECT bid,name,author,c_num,publishName,publishTime,price FROM book";
        if("1".equals(keys.get("keyselect"))){
            sqlStr += " WHERE name LIKE '%"+keys.get("keyword")+"%'";
        }

        if("2".equals(keys.get("keyselect"))){
            sqlStr += " WHERE author LIKE '%"+keys.get("keyword")+"%'";
        }

        List rows = jdbc.queryForList(sqlStr);

        List<Book> books = new ArrayList<Book>();
        Iterator it = rows.iterator();
        while (it.hasNext()){
            Map bookMap = (Map)it.next();
            Book book = new Book();
            book.setBid(Integer.valueOf(bookMap.get("bid").toString()));
            book.setName((String) bookMap.get("name"));
            book.setAuthor((String)bookMap.get("author"));
            book.setC_num((String)bookMap.get("c_num"));
            book.setPublishName((String)bookMap.get("publishName"));
            book.setPublishTime(Integer.valueOf(bookMap.get("publishTime").toString()));
            book.setPrice(Double.valueOf(bookMap.get("price").toString()));

            books.add(book);
        }

        return books;
    }
}
