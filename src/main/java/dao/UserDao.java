package dao;

import model.User;

/**
 * Created by lyp on 2015/1/16 0016.
 */
public interface UserDao {

    /**
     * 验证用户密码登陆
     */
    public User getUserByLogin(String username, String password);
}
