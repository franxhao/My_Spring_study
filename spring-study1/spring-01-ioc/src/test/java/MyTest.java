import com.hqyj.dao.impl.UserDaoOracleImpl;
import com.hqyj.service.UserService;
import com.hqyj.service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是Service 业务层，不需要接触 dao 数据层
        UserService userService = new UserServiceImpl();

        // IOC 思想
        //((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());

        userService.getUser();
    }
}
