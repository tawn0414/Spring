package book.exam.constructor;

public class LgTV implements TV_Inherit{
	Speaker spk;
	
	public LgTV(Speaker spk) {
		super();
		this.spk = spk;
	}
	
	public LgTV() {
		System.out.println("LgTV 기생");
	}
	public void turnOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("LgTV---소리 올린다.");
		spk.soundUp();
	}

	public void soundDown() {
		System.out.println("LgTV---소리 내린다.");
		spk.soundDown();
	}
}
