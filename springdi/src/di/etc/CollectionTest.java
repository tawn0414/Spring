package di.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
//��������� List�� Map�� ���DI�� ��� �����ؾ� �ұ�?
//��������� �߰��� List�� Map�� �����ʹ� xml���� �߰���.
public class CollectionTest {
	private ArrayList<String> list;
	private HashMap<String, String> map;
	
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	//ArrayList�� ����� ������ ����ϱ�.
	public void getList() {
		System.out.println("********ArrayList�� ����� ������*************");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void getMap() {
		System.out.println("********HashMap�� ����� ������*************");
		Set<String> keylist = map.keySet();
		for (String key : keylist) {
			System.out.println("key:"+key+","+"value:"+map.get(key));
		}
	}
}








