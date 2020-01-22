package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest4 {
	public static void main(String[] args) {
		//ApplicationContext���� ����� �� ����.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");						
		//�⺻������ singleton�̹Ƿ� getBean�� �� �� ȣ���ص� 
		//myBeanStyleB��ü�� �� ���� �����Ǿ� ȣ��ȴ�. �׷��� init�� �� �� ȣ��ȴ�.
		MyBeanStyleInherit obj1 = (MyBeanStyleInherit)factory.getBean("myBean2");
		MyBeanStyleInherit obj2 = (MyBeanStyleInherit)factory.getBean("myBean2");
		MyBeanStyleInherit obj3 = (MyBeanStyleInherit)factory.getBean("myBean2");
		run(obj1);
		show(obj1);

		//�����̳ʿ� ���� ������ ��ü�� �Ҹ�Ǵ� ������ �����̳ʰ� �Ҹ�� ����.
		factory.close();
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

