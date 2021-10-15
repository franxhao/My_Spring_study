import com.hqyj.pojo.User;
import com.hqyj.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 创建好对象，会调用无参构造;
        // 若没有无参构造会报错: java.lang.NoSuchMethodException 没有办法初始化，且bean中会报错
//        User user = (User) context.getBean("user");

        UserT user = (UserT) context.getBean("u6");

        user.show();
    }
}
