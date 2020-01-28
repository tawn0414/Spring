package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//�⺻ web���� �ۼ��ϴ� �������� ������ ������ �ϴ� Ŭ����
//������������ ��Ʈ�ѷ���� �θ�
//- DispatcherServlet���� ȣ��Ǵ� Ŭ������.
//- ���������� �ߴ� �� ó�� dao�� �޼ҵ带 ȣ����.
//- ������ ����(�������� ������)
public class TestController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("��Ʈ�ѷ� ��û �Ϸ�");
		//ModelAndView�� ������ ��� �Ѱ��� ���������� ������ ����信 ���� ������ ��� �ִ� ��������ü��.
		ModelAndView mav = new ModelAndView();
		
		//���� ������ ����
		//request.setAttribute("msg","��������Ʈ�ѷ����� �ѱ� ������"); �ѰŶ� �Ȱ���.
		mav.addObject("msg","��������Ʈ�ѷ����� �ѱ� ������");
		
		//spring�� default�� forward��.
		//forward�� ���� ������ ����
		mav.setViewName("test/result");
		return mav;
	}

}