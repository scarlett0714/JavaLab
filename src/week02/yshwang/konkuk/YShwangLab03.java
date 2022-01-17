package week02.yshwang.konkuk;

import java.util.Random;
import java.util.Scanner;

public class YShwangLab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202110547 황윤선");
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int com = r.nextInt(3);
		//int com = r.nextInt() % 3;
		
		System.out.println("가위(0), 바위(1), 보(2)중에 하나를 입력해주세요.");
		System.out.print("입력 : ");
		int user = scan.nextInt();
		
		//방법1.
//		switch (user) {
//		case 0:
//			System.out.println("user : 가위");
//			break;
//		case 1:
//			System.out.println("user : 바위");
//			break;
//		case 2:
//			System.out.println("user : 보");
//			break;
//		}
//		
//		switch (com) {
//		case 0:
//			System.out.println(" com : 가위");
//			break;
//		case 1:
//			System.out.println(" com : 바위");
//			break;
//		case 2:
//			System.out.println(" com : 보");
//			break;
//		}
//		
//		if(user!=com) {
//			if(user==0) {
//				if(com==1)
//					System.out.println("user 패배");
//				else
//					System.out.println("user 승리");
//			}
//			else if(user==1) {
//				if(com==0)
//					System.out.println("user 승리");
//				else
//					System.out.println("user 패배");
//			}
//			else {
//				if(com==0)
//					System.out.println("user 패배");
//				else
//					System.out.println("user 승리");
//			}
//		}
//		else
//			System.out.println("무승부");
//		scan.close();
		
		//방법2. checkResultap메소드 대신 rcp 문자열 배열 사용
//		String[] rcp = {"가위", "바위", "보"};
//		if(user>=0 && user<3) {
//			System.out.println("user : "+rcp[user] + "\n com : "+rcp[com]);
		
		//방법3. checkResult메소드 이용
		if(user>=0 && user<3) {
			System.out.println("user : "+checkResult(user) + "\n com : "+checkResult(com));
			if(user == com) 
				System.out.println("무승부");
			else if(user>com) {
				if(user == 2 && com == 0)
					System.out.println("졌습니다");
				else
					System.out.println("이겼습니다.");
			}
			else {
				if(user == 0 && com == 2)
					System.out.println("이겼습니다.");
				else
					System.out.println("졌습니다.");
			}
			
		}
		else
			System.out.println("잘못된 입력");
		
		scan.close();
			
	}

	private static String checkResult(int input) {
		String result = "";
		switch(input) {
		case 0 : 
			result = "가위";
			break;
		case 1 : 
			result = "바위";
			break;
		case 2 : 
			result = "보";
			break;
		}
		return result;
	}
	

}
