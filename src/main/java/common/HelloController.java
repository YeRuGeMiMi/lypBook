package common;

import com.jfinal.core.Controller;

/**
 * Created by Administrator on 2015/1/19 0019.
 */
public class HelloController extends Controller {

    public void index(){
        renderText("hello,world!");
    }
}
