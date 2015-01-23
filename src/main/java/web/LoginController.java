package web;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.plugin.spring.Inject;
import com.jfinal.plugin.spring.IocInterceptor;
import model.User;
import service.UserService;

/**
 * ��¼
 * Created by lyp on 2015/1/16 0016.
 */
@Before(IocInterceptor.class)
public class LoginController extends Controller {

    @Inject.BY_NAME
    private UserService userService;

    public void index(){

        if("GET".equals(getRequest().getMethod())){
            renderJsp("/jsp/login.jsp");
        }else{
            String username = getPara("username").trim();
            String passwd = getPara("passwd").trim();
            User user = userService.login(username,passwd);

            if(user == null){
                setAttr("msg","��¼ʧ�ܣ��û������������");
                renderJsp("/jsp/login.jsp");
            }else{
                setSessionAttr("user",user);
                forwardAction("/main");
            }
        }

    }
}
