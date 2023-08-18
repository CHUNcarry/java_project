package co.yedam.inheritance;

public class MainExe {
	
	public static void main(String[]args) {
		Cellphone cell = new Cellphone();	
		cell.setColor("black");
		cell.setModel("sm1100");
		cell.turnOn();
		cell.turnOff();
		
		DmbCellphone dmb = new DmbCellphone();
		dmb.setModel("DMB1100");
		dmb.setColor("white");
		dmb.turnOn();
		dmb.turnOff();
		
		
		Cellphone cell2 = new Cellphone();
		cell2.turnOn();
		Cellphone cell3 = new DmbCellphone();  //promotion
		
		
		//DmbCellphone dmb2 = (DmbCellphone) cell2; //casting
		//dmb2.turnOnBnb();
		
		if (cell instanceof DmbCellphone) {
		DmbCellphone dmb3 = (DmbCellphone) cell;
		dmb3.turnOnBnb();
		}
		
		Cellphone[] phones = new Cellphone[5];
		phones[0] = cell;
		phones[1] = dmb;
		
		phones[0].turnOn();//Cellphone 인스턴스
		phones[1].turnOn();;//DmbCellphone 인스턴스
	}

}
