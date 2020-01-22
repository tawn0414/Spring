package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//BeanFactory(�����̳�)�� ��ü�� �����ϴ� ��� - ���� ��ü�� ���������� �˰����.
public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("*************Resource������**************");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		System.out.println("*************BeanFactory������***********");
		BeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println("*************getBeanȣ����***************");
		MyBeanStyleInherit obj1 = (MyBeanStyleInherit)factory.getBean("myBean1");
		MyBeanStyleInherit obj2 = (MyBeanStyleInherit)factory.getBean("myBean1");
		if(obj1==obj2) {
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		run(obj1);
		show(obj1);
		run(obj2);
		show(obj2);

	}
	public static void run(MyBeanStyleInherit obj) {
		System.out.println("*******************");
		obj.Hello("����");
		obj.Hello("����");
		System.out.println("*******************");
	}
	
	public static void show(MyBeanStyleInherit obj) {
		System.out.println("====================");
		obj.Hello("����");
		obj.Hello("����");
		System.out.println("====================");
	}
}

