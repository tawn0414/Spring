package firstexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("config/hr.xml");
		jobDAO dao = factory.getBean("jobdao", jobDAO.class);
		System.out.println("전체 레코드 수: "+dao.count());

	}

}
