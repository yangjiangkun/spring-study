import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class MyTest {
	public static void main(String[] args) {
		//�����ȫʹ���������෽��ȥ��,���Ǿ�ֻ��ͨ��AnnotationConfig �������л�ȡ����,ͨ���������class�������!
		ApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
		User getUser = (User) context.getBean("user");
		System.out.println(getUser.getName());

	}
}
