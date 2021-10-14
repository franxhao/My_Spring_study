package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import dao.impl.UserDaoMysqlImpl;
import dao.impl.UserDaoOracleImpl;
import dao.impl.UserDaoSQLServerImpl;
import service.UserService;

/**
 * 1.演示没有使用Spring IOC容器
 * 2.演示 IOC 思想
 */
public class UserServiceImpl implements UserService {

    // *** 演示每次需要对象都要手动new，使用新对象的时候都需要在业务层做更换 ***
    // 假如用户需要默认数据
    //private UserDao userDao = new UserDaoImpl();
    // 假如用户需要MySQL数据
    //private UserDao userDao = new UserDaoMysqlImpl();
    // 假如用户需要Oracle数据
    //private UserDao userDao = new UserDaoOracleImpl();
    // 假如用户需要SQLServer数据
    //private UserDao userDao = new UserDaoSQLServerImpl();

    // *** IOC 思想 ***
    private UserDao userDao;

    // 利用 set 进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
