package common;

import com.jfinal.core.Controller;

/**
 * Created by lyp on 2015/1/16 0016.
 */
public class CommonController extends Controller {

    public void index(){

        if (getSessionAttr("user") == null){
            renderJsp("/jsp/login.jsp");
        }else{
            renderJsp("/index.jsp");
        }
    }
}
