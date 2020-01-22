package app3;

public class MyBeanStyleB extends MyBeanStyleInherit{
	public MyBeanStyleB() {
		System.out.println("MyBeanStyleB의 기본생성자.");
	}
	public void Hello(String name) {
		System.out.println("MyBeanStyleB,"+name);
	}
}
