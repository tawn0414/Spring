package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
	�������� �̿��ؼ� ���α׷��� �����ϱ�. 
		- new �����ڸ� �̿��ؼ� ��ü�����ϴ� �ڵ带 ���� �������� �ʴ´�. (API�� ����)
		- ������ ���ο��� �����ϴ� FactoryŬ������ �̿��ؼ� ��ü�� ���޹޴´�.
 */
public class MyBeanTest {
	public static void main(String[] args) {
		//�������� FactoryŬ������ �����ϱ�.
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");				
		//�ʿ��� ��ü�� factory�� ���� �����´�. (�º��� �θ�Ÿ�� ����)
		//�������Ͽ� ����� id���� ���� - <bean>�±��� id�Ӽ��� ����
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
