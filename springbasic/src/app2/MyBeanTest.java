package app2;
/*
 * oop가 적용되어 있는 프로그램.
 * oop특성을 적용하기 위해 상위클래스를 정의하소 MyBeanStyleXXX클래스를 사용하는 매개변수의 타입을
 * 상위타입으로 변경하여 다형성을 적용했다.
 * 결국 사용되는 객체가 변경되더라도 코드를 수정하는 범위는 줄어들었다.
 * 
 * 그러나 실제 객체를 전달하는 곳에서는 생성해서 전달하고 있다.
 * 사용하는 객체가 바뀔때마다 객체를 직접 생성하는 코드를 모두 수정해야 한다는 단점은 존재한다.
 *  => 사용하는 곳에서 직접 new해서 객체를 생성하는 코드는 없어져야 하는 코드다.
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
		obj.Hello("현빈");
		obj.Hello("현빈");
		System.out.println("*******************");
	}
	
	public static void show(MyBeanStyleInherit obj) {
		System.out.println("====================");
		obj.Hello("현빈");
		obj.Hello("현빈");
		System.out.println("====================");
	}
}

