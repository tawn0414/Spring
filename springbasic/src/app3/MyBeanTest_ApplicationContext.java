package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//ApplicationContext가 객체를 관리하는 방법.
public class MyBeanTest_ApplicationContext {
	public static void main(String[] args) {
		System.out.println("-------------ApplicationContext생성전-------------");
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");				

		System.out.println("------------getBean호출전--------------");
		MyBeanStyleInherit obj = (MyBeanStyleInherit)factory.getBean("myBean1");
		//비즈니스로직 호출
		run(obj);
		show(obj);

	}
	public static void run(MyBeanStyleInherit obj) {
		System.out.println("*******************");
		obj.Hello("현빈");
		obj.Hello("현빈");
		System.out.println("*******************");
	}
	
	public static void show(MyBeanStyleInherit obj) {
		System.out.println("====================");
		obj.Hello("현빈");
		obj.Hello("현빈");
		System.out.println("====================");
	}
}

