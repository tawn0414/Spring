package front.fw;

import java.util.HashMap;

import member.LoginAction;
import member.MemberInsert;
import product.ProductList;

/*
 * FrontServlet�� �Ѱ��� ��û path�� ������ ���� ������ Ŭ������ ��ü�� ���� �����ϴ� �۾��� ����
   => �̸� ��û�� path���� ������ ���� Ŭ������ ����� ���������� ���� ��ü�� ã�Ƽ� ���� mycommand.properties���Ͽ�
           ��ϵ� ��û path�� ���� ������ ��ü�� ã�´�.
      xml�����̳� properties������ �Ľ��ϴ� �ڵ��� ���� -> �츮�� ����.
   */
public class RequestMapping {
	//xml�̳� properties������ �Ľ��ؼ� �����س��� ��ü�� ������ map.
	//��û path�� key, ���� ������ ��ü�� value�� �ȴ�.
	private HashMap<String,Action> actionMap = new HashMap<String,Action>();
	public RequestMapping() {
		//������ ���ο��� ���������� �Ľ��ؼ� ��ü�� ����� �ڵ尡 ���ǵǾ�� �Ѵ�. �츮�� ������.
	}
	public Action mapping(String path) {
		//�Ű������� ���޵� path�� ��ϵ� Action��ü�� actionMap���� ã�Ƽ� �����ؾ��ϴ� �ڵ尡 ���ǵǾ��
		//������ �츮�� if else�� �켱 ó���Ѵ�.
		//���� if else���� �������̹Ƿ� �߰����Ǹ� mapping�޼ҵ带 �����ؾ� ������ ������ xml������
		//properties������ �м��ؼ� �ڵ����� ���鵵�� �ڵ带 ������ ���̹Ƿ� �ڵ� ������ ���ص� �ȴ�.
		Action action = null;
		if(path.equals("/product/list.do")) {
			action = new ProductList(); //��û������ /product/list.do�� ProductList��ü�� �����϶�~
		}else if(path.equals("/member/customer/insert.do")) {
			action = new MemberInsert();
		}else if(path.equals("/login.do")) {
			action = new LoginAction();
		}
		return action;
	}
}