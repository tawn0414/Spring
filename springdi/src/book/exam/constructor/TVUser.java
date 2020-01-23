package book.exam.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * 삼성티비의 소리를 올리면 소니 스피커의 볼륨이 올라가게
		 * 삼성티비의 소리를 내리면 소니 스피커의 볼륨이 내려가게 해주기.
		 */
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		TV_Inherit tv = factory.getBean("tv",TV_Inherit.class); //이렇게 캐스팅해도됨. 제일 상위인 애로 캐스팅
		
		
		
		tv.soundUp();
		tv.soundDown();

	}
}