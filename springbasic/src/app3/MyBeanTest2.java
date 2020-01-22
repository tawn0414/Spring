package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//BeanFactory�� ����ؼ� �۾��ϱ�.
//[�۾��ܰ�]
//1. xml�� spring���� ����� �� �ֵ��� ��ü�� ��ȯ�ϴ� �۾��� �����ϴ� ��ü����
//	-> ClassPathResource�� xml������ classpath(src)���� ã�´�.
//2. �����̳� ��ü�� �����ϱ�.
public class MyBeanTest2 {
	public static void main(String[] args) {
		//1. xml�Ľ��� ����ϴ� ��ü, Resource -> springframework.core
		Resource res = new ClassPathResource("/config/bean.xml");//-> bean.xml�� �м��ϰڴ�.
		//2. �����̳� ��ü�� ����
		BeanFactory factory = new XmlBeanFactory(res); //xml�� �м��ϴ°� res��. res�� xml�� ���� ����.
													   //�����̳ʴ� xml�� �ʿ��ϴϱ� res�־��� ��.
		//3. �����̳ʰ� �����ϴ� ��ü�� ���޹ޱ�
		MyBeanStyleInherit obj = (MyBeanStyleInherit)factory.getBean("myBean");
		//����Ͻ����� ȣ��
		run(obj);
		show(obj);

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

