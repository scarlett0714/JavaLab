package week05.yshwang.konkuk;

import java.util.Scanner;

public class Salesman {
	private String name; 
	private double sales; 
	
	public static Scanner scan = new Scanner(System.in);
	
	//생성자
	public Salesman() {
		readInput();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void readInput() {
		System.out.print("이름: ");
		this.name = scan.next();
		System.out.print("실적: ");
		this.sales = scan.nextDouble();
		System.out.println("입력완료");
	}
	
	@Override
	public String toString() {
		
		String str = "이름 : "+ this.name+" / 실적: "+this.sales;
		return str;
	}
	
	//get & set
	public String getName() {
		return name;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	
}
