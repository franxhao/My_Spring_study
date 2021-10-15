import com.hqyj.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象现在都在 Spring中进行管理了，我们要使用，直接去里面取
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
