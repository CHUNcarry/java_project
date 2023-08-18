package co.yedam.inheritance;

public class DmbCellphone extends Cellphone{
	
	private int channel;

	public void changeChannel(int channel) {
		this.channel = channel;
	}
	
	public void turnOnBnb() {
		System.out.println("전원을 킵니다");
	}
	
	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println(getModel()+" ON");
	}

}
