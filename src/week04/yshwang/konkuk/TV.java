package week04.yshwang.konkuk;

public class TV {
			//필드 선언
			public boolean power; //자동으로 power값은 false로 초기화
			public int channel = 10; //자동으로 channel값은 0으로 초기화, 원하는 값으로 초기화 가능
			public int volume = 19;
			
			//메소드 선언
			public void show() { //현 상태를 확인하기위한 출력구문
				if(power) {//전원이 들어와있는 경우
					System.out.println("현재 "+channel+"번, vol:"+volume+"로 시청 중");
				}
				else //전원이 들어와있지 않은 경우
					System.out.println("TV전원 꺼져있음");
			}
			
			public void powerOnOff() {
				//false->true,true->false
				power = !power; //필드에 선언된 변수들은 static이 붙어있지 않으므로 클래스나부에선 필드이름으로 자유롭게 사용가능
				show();
			}
			
			public void channelUp() {
				if(power) {
					++channel; 
				}
				show();
			}
			
			public void channelDown() {
				if(power) {
				--channel;
				}
				show();
			}
			
			public void volumeUp() {
				if(power) {
					if(volume>=0 && volume<20)
						++volume;
					else
						System.out.println("더 이상 볼륨을 올릴 수 없습니다.");
				}
				show();
			}
			
			public void volumeDown() {
				if(power) {
					if(volume>0 && volume<=20)
						--volume;
					else
						System.out.println("더 이상 볼륨을 내릴 수 없습니다.");
				}
				show();
				
			}
			
			public void changeChannel(int ch) {
				if(power)
					channel = ch;
				show();
			}
			
			public void changeVolume(int vol) {
				if(power)
					volume = vol;
				show();
			}
}
