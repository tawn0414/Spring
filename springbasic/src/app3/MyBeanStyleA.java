package app3;

public class MyBeanStyleA extends MyBeanStyleInherit{
	public MyBeanStyleA() {
		System.out.println("MyBeanStyleA의 기본생성자.");
	}
	public void Hello(String name) {
		System.out.println("MyBeanStyleA,"+name);
	}
}
