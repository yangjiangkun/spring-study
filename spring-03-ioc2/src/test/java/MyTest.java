import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {

		//Spring�������������ڻ����վ
		ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");

		User user = (User) context.getBean("user");
		User user2 = (User) context.getBean("user");
		user.show();
		System.out.println(user== user2);

		UserT user1 = (UserT)context.getBean("u4");
		user1.show();

		//�ܽ᣺�������ļ����ص�ʱ�������й���Ķ�����Ѿ�����ʼ���ˣ�


	}
}
