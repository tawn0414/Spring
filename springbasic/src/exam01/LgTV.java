package exam01;

public class LgTV implements TV_Inherit{
	public void turnOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("LgTV---소리 올린다.");
	}

	public void soundDown() {
		System.out.println("LgTV---소리 내린다.");
	}
}
