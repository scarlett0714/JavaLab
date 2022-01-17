package week02.yshwang.konkuk;

import java.util.Scanner; 

public class YShwangLab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202110547 황윤선");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번:");
		int num = scanner.nextInt();
		System.out.print("이름:");
		String name = scanner.next();
		System.out.print("나이:");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("주소:");
		String addr = scanner.nextLine();
		
		System.out.println("학번:"+num);
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("주소:"+addr);
		
		scanner.close();
	}

}
