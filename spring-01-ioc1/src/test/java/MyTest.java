import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoSQLserverImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {

//		//�û�ʵ�ʵ��õ���ҵ��㣬dao�����ǲ���Ҫ�Ӵ���
//		UserService userService = new UserServiceImpl();
//
//		//����˼�룬�ӱ����Ͻ�������⣬���ǳ���Գ������ȥ�������Ĵ����ˡ�ϵͳ������Դ�󽵵�
//		//����Գ���Ը���רע����ҵ���ʵ����  ����IOC��ԭ��
//		((UserServiceImpl) userService).setUserDao(new UserDaoSQLserverImpl());
//
//		userService.getUser();

		//��ȡApplicationContext;
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//�������֣��������У���Ҫʲô����ֱ��getʲô��
		UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

		userServiceImpl.getUser();


	}
}
