package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		String data = "";
		for(int i =1;i<=9;i++) {
			data = data+(9+"*"+i+"="+(9*i)+"<br/>");
		}
		mav.addObject("gugu",data);
		mav.setViewName("/WEB-INF/jsp/result.jsp");
		
		return mav;
	}

}
