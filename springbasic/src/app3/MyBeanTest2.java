package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//BeanFactory를 사용해서 작업하기.
//[작업단계]
//1. xml을 spring에서 사용할 수 있도록 객체로 변환하는 작업을 수행하는 객체생성
//	-> ClassPathResource는 xml문서를 classpath(src)에서 찾는다.
//2. 컨테이너 객체를 생성하기.
public class MyBeanTest2 {
	public static void main(String[] args) {
		//1. xml파싱을 담당하는 객체, Resource -> springframework.core
		Resource res = new ClassPathResource("/config/bean.xml");//-> bean.xml을 분석하겠다.
		//2. 컨테이너 객체를 생성
		BeanFactory factory = new XmlBeanFactory(res); //xml을 분석하는게 res임. res가 xml을 갖고 있음.
													   //컨테이너는 xml이 필요하니까 res넣어준 것.
		//3. 컨테이너가 관리하는 객체를 전달받기
		MyBeanStyleInherit obj = (MyBeanStyleInherit)factory.getBean("myBean");
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

