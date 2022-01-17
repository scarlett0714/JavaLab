package week01.yshwang.konkuk;

public class Price {

	//앞에 static을 쓰지 않는다면, 객체 생성을 해야 상수 사용가능
	//static을 쓸 경우, 객체 생성 필요x
	final int COFFEE = 100;
	final int MILK = 50;
	final int WATER = 10;
	
	//main함수는 반드시 static필요, 사용자지정함수는 static선택
	//static을 쓰지 않는다면, getCost->menu.getCost로 객체를 통해 접근해야함. (물론 객체 생성 필요 : 31에서 생성)
	public static int getCost(int price, int num) {
		return price*num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202110547 황윤선");
		
		//main메서드 안에다가 지역상수로 선언할 경우, static필요 없음.
		/*final int COFFEE = 100;
		final int MILK = 50;
		final int WATER = 10;*/
		
		int coffeeOrder = 5;
		int milkOrder = 2;
		int waterOrder = 1;
		
		//static이 없는 경우, 객체를 통해서만 접근가능
		Price menu = new Price(); //Price type의 객체(변수) 생성 방법 : new 사용하기
		
		//main메서드 안에다가 지역상수로 선언할 경우
		/*int coffeeCost = getCost(COFFEE, coffeeOrder);
		int milkCost = getCost(MILK, milkOrder);
		int waterCost = getCost(WATER, waterOrder);*/
		
		//main메서드 밖에 Price의 class 멤버로 상수를 선언할 경우, 생성한 객체를 통해 접근(menu.~~)
		int coffeeCost = getCost(menu.COFFEE, coffeeOrder);
		int milkCost = getCost(menu.MILK, milkOrder);
		int waterCost = getCost(menu.WATER, waterOrder);
		
		int totalCost = coffeeCost+milkCost+waterCost;
		System.out.println("총 주문금액 : "+totalCost+"원");
		
	}

}
