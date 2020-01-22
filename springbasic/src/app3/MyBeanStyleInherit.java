package app3;

public abstract class MyBeanStyleInherit {
	public abstract void Hello(String name);
	//객체가 생성될 때 한 번 호출되는 메소드
	public void myInit() {
		System.out.println("init...");
	}
	//객체가 소멸될 때 한 번 호출되는 메소드
	public void myDestroy() {
		System.out.println("destroy...");
	}
}
