import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		//��ȡSpringd�������Ķ���
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//���ǵĶ������ڶ���Spring�й����ˣ�����Ҫʹ�ã�ֱ��ȥ����ȡ�����Ϳ����ˣ�
		Hello hello = (Hello) context.getBean("hello");
		System.out.println(hello.toString());
	}
}
