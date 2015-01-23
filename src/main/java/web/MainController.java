package web;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.plugin.spring.Inject;
import com.jfinal.plugin.spring.IocInterceptor;
import model.Book;
import service.BookService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lyp on 2015/1/19 0019.
 */
@Before(IocInterceptor.class)
public class MainController extends Controller {

    @Inject.BY_NAME
    private BookService bookService;

    /**
     * 主页
     */
    public void index(){

        renderJsp("/jsp/main.jsp");
    }

    /**
     * 增加图书
     */
    public void addBook(){
        if("GET".equals(getRequest().getMethod())){
            renderJsp("/jsp/addBook.jsp");
        }else{
            Map<String,Object> keys = new HashMap<String,Object>();
            keys.put("name",getPara("name").trim());
            keys.put("author",getPara("author").trim());
            keys.put("c_num",getPara("c_num").trim());
            keys.put("publishName",getPara("publishName").trim());
            keys.put("publishTime",getPara("publishTime").trim());
            keys.put("price",Double.valueOf(getPara("price").trim()));

            boolean bool = bookService.addBook(keys);

            if(bool){
                setAttr("msg","增加成功");

            }else{
                setAttr("msg","增加失败");
            }

            renderJsp("/jsp/addBook.jsp");
        }
    }

    /**
     * 图书管理
     */
    public void bookControl(){
        Map<String,String> keys = new HashMap<String, String>();
        if("POST".equals(getRequest().getMethod())){
            keys.put("keyselect",getPara("keyselect").trim());
            keys.put("keyword",getPara("keyword").trim());
            setAttr("keys",keys);
        }
        List<Book> books = bookService.getBooks(keys);
        setAttr("books",books);

        renderJsp("/jsp/bookControl.jsp");
    }

    /**
     * 删除图书
     */
    public void delBook(){
        int bid = getParaToInt("bid");
        boolean bool = bookService.delBook(bid);

        if (bool){
            setAttr("msg","删除成功");
        }else{
            setAttr("msg","删除失败");
        }

        forwardAction("/main/bookControl");
    }
}
