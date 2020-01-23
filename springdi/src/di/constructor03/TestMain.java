package di.constructor03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		IWriteArticleMgr write = factory.getBean("write",IWriteArticleMgr.class);
		ArticleDTO dto = new ArticleDTO();
		write.write(dto);
		
	}

}
