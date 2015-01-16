package dao.impl;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yfl on 2015/1/16 0016.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public User getUserByLogin(String username, String password) {
        String sqlStr = "select * from tuser where username=? and password=?";
        final User user = new User();
        jdbc.query(sqlStr,new Object[]{username,password},new RowCallbackHandler(){
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                if(resultSet == null){
                    user.setUid(resultSet.getInt("uid"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                }
            }
        });
        return user;
    }
}
