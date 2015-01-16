package common;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;
import web.LoginController;

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

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
