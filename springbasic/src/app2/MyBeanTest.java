package app2;
/*
 * oop�� ����Ǿ� �ִ� ���α׷�.
 * oopƯ���� �����ϱ� ���� ����Ŭ������ �����ϼ� MyBeanStyleXXXŬ������ ����ϴ� �Ű������� Ÿ����
 * ����Ÿ������ �����Ͽ� �������� �����ߴ�.
 * �ᱹ ���Ǵ� ��ü�� ����Ǵ��� �ڵ带 �����ϴ� ������ �پ�����.
 * 
 * �׷��� ���� ��ü�� �����ϴ� �������� �����ؼ� �����ϰ� �ִ�.
 * ����ϴ� ��ü�� �ٲ𶧸��� ��ü�� ���� �����ϴ� �ڵ带 ��� �����ؾ� �Ѵٴ� ������ �����Ѵ�.
 *  => ����ϴ� ������ ���� new�ؼ� ��ü�� �����ϴ� �ڵ�� �������� �ϴ� �ڵ��.
 * */
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleA objA = new MyBeanStyleA();
		MyBeanStyleB objB = new MyBeanStyleB();
		run(objA);
		show(objA);
		run(objB);
		show(objB);
	}
	public static void run(MyBeanStyleInherit obj) {
		System.out.println("*******************");
		obj.Hello("����");
		obj.Hello("����");
		System.out.println("*******************");
	}
	
	public static void show(MyBeanStyleInherit obj) {
		System.out.println("====================");
		obj.Hello("����");
		obj.Hello("����");
		System.out.println("====================");
	}
}
