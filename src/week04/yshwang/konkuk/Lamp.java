package week04.yshwang.konkuk;

public class Lamp {

	public boolean isOn;
	public int illuminance;
	
	public Lamp() {
		this(false, 1);
	}
	
	public Lamp(boolean isOn, int illuminance) {
		this.isOn = isOn;
		this.illuminance = illuminance;
	}
	
	public void turnOnOff() {
		isOn = !isOn;
	}
	
	public void changeLight() {
		if(isOn==true) {
			if(this.illuminance<3 && this.illuminance>=1)
				++this.illuminance;
			else if(this.illuminance==3)
				this.illuminance = 1;
			show();
		}
		
	}
	
	public void show() {
		if(this.isOn==true) {
			System.out.println("전원이 켜져있습니다.");
			System.out.println("현재 조도는 "+this.illuminance+"입니다.");
		}
		else
			System.out.println("전원이 꺼져있습니다.");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		System.out.println("202110547 황윤선");
		Lamp lamp = new Lamp();
		lamp.show();
		
		lamp.turnOnOff();
		lamp.show();
		lamp.changeLight();
		lamp.changeLight();
		lamp.changeLight();
		lamp.changeLight();
		lamp.turnOnOff();
		lamp.show();

	}

}
