package week02.yshwang.konkuk;

import java.util.Scanner;

public class YShwangLab04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202110547 황윤선");
		
		Scanner scan = new Scanner(System.in);
		String password = "greenjoa";
		int count = 0;
		
		do {
			String input = scan.next();
			if(input.equals(password)) {
				System.out.println("환영합니다.");
				scan.close();
				System.exit(0);
			}
			else
				count++;
			System.out.println("암호가 틀립니다.");
		}while(count<3);
		
		System.out.println("접속을 거부합니다.");
		scan.close();
		System.exit(0);
		
		//방법2.
//		final String password = "greenjoa";
//		String input = "";
//		int count = 0;
//		
//		do {
//			System.out.println("암호를 입력하세요 : ");
//			input = scan.next();
//			if(input.equals(password)) {
//				System.out.println("환영합니다.");
//				break;
//			}else {
//				System.out.println("암호가 틀립니다.");
//				count++;
//				System.out.println(count + "번 틀렸습니다.");
//				if(count == 3) {
//					System.out.println("접속을 거부합니다.");
//					break;
//				}
//			}
//		} while(true);
		
	}

}
