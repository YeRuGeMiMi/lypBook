package common;

import com.jfinal.config.*;
import com.jfinal.plugin.spring.SpringPlugin;
import com.jfinal.render.ViewType;
import web.LoginController;
import web.MainController;

/**
 * Created by lyp on 2015/1/16 0016.
 */
public class MyJFinalConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
        constants.setViewType(ViewType.JSP);

    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/",CommonController.class);
        routes.add("/login",LoginController.class);
        routes.add("/hello",HelloController.class);
        routes.add("/main", MainController.class);

    }

    @Override
    public void configPlugin(Plugins plugins) {
        plugins.add(new SpringPlugin("classpath:spring.xml"));

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
