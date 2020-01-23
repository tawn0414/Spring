package book.exam.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * �ＺƼ���� �Ҹ��� �ø��� �Ҵ� ����Ŀ�� ������ �ö󰡰�
		 * �ＺƼ���� �Ҹ��� ������ �Ҵ� ����Ŀ�� ������ �������� ���ֱ�.
		 */
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		TV_Inherit tv = factory.getBean("tv",TV_Inherit.class); //�̷��� ĳ�����ص���. ���� ������ �ַ� ĳ����
		
		
		
		tv.soundUp();
		tv.soundDown();

	}
}