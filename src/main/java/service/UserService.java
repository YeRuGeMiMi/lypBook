package service;

import model.User;


/**
 * Created by lyp on 2015/1/19 0019.
 */
public interface UserService {

    /**
     * 登入服务
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password);

}
