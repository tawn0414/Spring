package app3;

public abstract class MyBeanStyleInherit {
	public abstract void Hello(String name);
	//��ü�� ������ �� �� �� ȣ��Ǵ� �޼ҵ�
	public void myInit() {
		System.out.println("init...");
	}
	//��ü�� �Ҹ�� �� �� �� ȣ��Ǵ� �޼ҵ�
	public void myDestroy() {
		System.out.println("destroy...");
	}
}
