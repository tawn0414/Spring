package exam01;

public class TVUser {
	public static void main(String[] args) {
		TV_Inherit tv = new SamsungTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
		TV_Inherit lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();
	}
}