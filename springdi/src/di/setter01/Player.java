package di.setter01;

//player가 갖고 있는 Dice를 외부에서(스프링컨테이너) Injection받아 사용해야 하므로 Injection받을 수 있도록 미리 준비해야 한다.
public class Player implements AbstractPlayer {
	AbstractDice d; //인터페이스의 타입으로 해주자. 그래야 모든 하위를 다 받을 수 있으니까. dice, 크리스탈dice 등....
	int totalValue=0;

	public Player() {
		System.out.println("player의 기본생성자.");
	}
	
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player의 매개변수 1개 생성자");
	}

	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}

	public int getTotalValue(){
		return totalValue;
	}

	public AbstractDice getD() {
		return d;
	}

	public void setD(AbstractDice d) {
		this.d = d;
	}
	
	
}