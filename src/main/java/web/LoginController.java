package web;

import com.jfinal.core.Controller;

/**
 * Created by lyp on 2015/1/16 0016.
 */
public class LoginController extends Controller {

    public void index(){
        String username = getPara("username");
        String passwd = getPara("passwd");

    }
}
