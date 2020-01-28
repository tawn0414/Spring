package front.fw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*실제 실행할 클래스의 상위타입
RequestMapping클래스가 실행할 클래스를 찾아서 리턴할 때 공통의 타입이 있어야*/
public interface Action {
	void run(HttpServletRequest request, HttpServletResponse responser) throws ServletException, IOException;
}
