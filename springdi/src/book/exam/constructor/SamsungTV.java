package book.exam.constructor;

public class SamsungTV implements TV_Inherit{
	//���� Ŭ���� ���ο��� ����ϴ� ��ü -> ������ �����̳ʸ� ���� ���޹��� �� �ֵ��� �غ�.
	Speaker spk;
	
	public SamsungTV(Speaker spk) {
		super();
		this.spk = spk;
	}
	
	public SamsungTV() {
		System.out.println("SamsungTV �⺻������");
	}
	
	public void turnOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void soundUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		spk.soundUp(); //�����̸�.  �� �����̸��� Ÿ���� �����ִ� �޼ҵ带 ���ڴٴ� ��.
	}

	public void soundDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		spk.soundDown();
	}
}
