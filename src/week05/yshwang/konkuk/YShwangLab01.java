package week05.yshwang.konkuk;

import java.util.Scanner;

public class YShwangLab01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("202110547 황윤선");
		System.out.println("**** 팀 생성 ****");
		System.out.print("팀원 수 : ");
		int number = scan.nextInt();
		SalesReport team1 = new SalesReport(number);
		
		team1. computeStats();
		
		System.out.println();
		System.out.println("**** 최고사원 정보 ****");
		System.out.println(team1.getBestClerk());
		
		System.out.println();
		System.out.println("**** 팀 정보 ****");
		System.out.println(team1);

		scan.close();
	}

}
