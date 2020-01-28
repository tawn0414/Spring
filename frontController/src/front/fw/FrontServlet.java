package front.fw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//모든 요청이 FrontServlet을 통해 들어올 수 있도록 설정
@WebServlet(name="front",urlPatterns= {"*.do","*.jsp","*.html"}) //확장자가 do, jsp, html인 것들을 모두 받겠다.
public class FrontServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청 정보를 분석해서 추출하기 - 아직 어떤 path로 요청하는지 모른다.
		System.out.println("요청받기");
		System.out.println("request.getContextPath()=>"+request.getContextPath());
		System.out.println("request.getRequestURI()=>"+request.getRequestURI());
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String path = requestURI.substring(contextPath.length()); //내가 원하는 path, requestURI에서 contextPath의 길이만큼을 제거.
		System.out.println("path=> "+ path);
		
		//추출한 요청 path로 등록되어 있는 실행할 클래스 정보를 찾아오는 작업.
		//RequestMapping객체에 의뢰 => RequestMapping객체의 메소드를 호출
		//                         하면 실제 실행할 객체를 찾아서 리턴.
		RequestMapping mappingObj = new RequestMapping();
		Action action = mappingObj.mapping(path);
		
		//Action객체의 메소드를 호출
		action.run(request, response);
		
		//run메소드의 실행결과를 받아서 응답할 view를 찾는다.
		
		//응답 view로 forward 나 redirect를 한다.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);		
	}

}
