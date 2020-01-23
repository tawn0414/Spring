package book.exam.constructor;

public class LgTV implements TV_Inherit{
	Speaker spk;
	
	public LgTV(Speaker spk) {
		super();
		this.spk = spk;
	}
	
	public LgTV() {
		System.out.println("LgTV ���");
	}
	public void turnOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void soundUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		spk.soundUp();
	}

	public void soundDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		spk.soundDown();
	}
}
