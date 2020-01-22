package di.constructor01;

//player�� ���� �ִ� Dice�� �ܺο���(�����������̳�) Injection�޾� ����ؾ� �ϹǷ� Injection���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�.
public class Player implements AbstractPlayer {
	AbstractDice d; //�������̽��� Ÿ������ ������. �׷��� ��� ������ �� ���� �� �����ϱ�. dice, ũ����Żdice ��....
	int totalValue=0;

	public Player(AbstractDice d) {
		super();
		this.d = d;
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
}