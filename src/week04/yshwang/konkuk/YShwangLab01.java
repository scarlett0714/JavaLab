package week04.yshwang.konkuk;

public class YShwangLab01 {

	public static void main(String[] args) {
		System.out.println("202110547 황윤선");
		System.out.println("====== TV1 ======");
		TV tv1 = new TV(); //TV객체는 heap영역에 생성됨, tv1변수는 stack영역에 생성되고 TV객체의 주소를 가짐
		tv1.powerOnOff();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelDown();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.volumeDown();
		//채널, 볼륨 change
		int c = 5;
		int v = 7;
		tv1.changeChannel(c);
		tv1.changeVolume(v);
		tv1.powerOnOff();
		
		System.out.println("\n====== TV2 ======");
		TV tv2 = new TV(); //필요할 때마다 객체 생성
		tv2.powerOnOff();
		tv2.channelUp();
		tv2.volume = 1;
		tv2.volumeDown();
		tv2.volumeDown();
		tv2.volumeUp();
		
		System.out.println("tv1 : "+tv1);
		System.out.println("tv2 : "+tv2);
		System.out.println("\n====== TV1 = TV2 ======"); //tv1과 tv2는 타입이 같아 대입연산가능
		tv1 = tv2;
		System.out.println("tv1 : "+tv1);
		System.out.println("tv2 : "+tv2);
		
		System.out.println("\n====== TV1 ======");
		tv1.show(); //tv1은 꺼져있었음에도 불구하고 tv2의 값을 대입받아 tv2의 상태 출력

	}

}
