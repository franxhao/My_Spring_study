package com.hqyj.dao.impl;

import com.hqyj.dao.UserDao;

public class UserDaoSQLServerImpl implements UserDao {
    public void getUser() {
        System.out.println("用户调用SQLServer");
    }
}
