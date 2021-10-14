package dao.impl;

import dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {
    public void getUser() {
        System.out.println("用户调用MySQL");
    }
}
