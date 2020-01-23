package book.exam.constructor;

public class SamsungTV implements TV_Inherit{
	//현재 클래스 내부에서 사용하는 객체 -> 스프링 컨테이너를 통해 전달받을 수 있도록 준비.
	Speaker spk;
	
	public SamsungTV(Speaker spk) {
		super();
		this.spk = spk;
	}
	
	public SamsungTV() {
		System.out.println("SamsungTV 기본생성자");
	}
	
	public void turnOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("SamsungTV---소리 올린다.");
		spk.soundUp(); //변수이름.  은 변수이름의 타입이 갖고있는 메소드를 쓰겠다는 말.
	}

	public void soundDown() {
		System.out.println("SamsungTV---소리 내린다.");
		spk.soundDown();
	}
}
