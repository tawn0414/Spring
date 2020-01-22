package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest4 {
	public static void main(String[] args) {
		//ApplicationContext보다 기능이 더 많다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");						
		//기본설정이 singleton이므로 getBean을 세 번 호출해도 
		//myBeanStyleB객체는 한 개만 생성되어 호출된다. 그래서 init도 한 번 호출된다.
		MyBeanStyleInherit obj1 = (MyBeanStyleInherit)factory.getBean("myBean2");
		MyBeanStyleInherit obj2 = (MyBeanStyleInherit)factory.getBean("myBean2");
		MyBeanStyleInherit obj3 = (MyBeanStyleInherit)factory.getBean("myBean2");
		run(obj1);
		show(obj1);

		//컨테이너에 의해 생성된 객체가 소멸되는 시점은 컨테이너가 소멸될 때임.
		factory.close();
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

