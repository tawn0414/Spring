package dl.exam01;

public class SamsungTV implements TV_Inherit{
	public SamsungTV() {
		System.out.println("SamsungTV ���");
	}
	public void turnOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void soundUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}

	public void soundDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
	}
}
