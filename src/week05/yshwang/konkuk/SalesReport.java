package week05.yshwang.konkuk;

public class SalesReport {
	
	private Salesman[] team;
	private double hightestSales;
	private double averageSales;
	private int number;
	
	//생성자
	public SalesReport(int number) {
		this.number = number;
		this.team = new Salesman[this.number];
		for(int i=0;i<number;i++) {
			System.out.println((i+1)+"번째 팀원 정보 입력");
			this.team[i] = new Salesman();
		}
	}
	
	public void computeStats() {
		//최고 판마액 계산
		for(int i=0;i<this.number;i++) {
			if(team[i].getSales()>hightestSales)
				hightestSales = team[i].getSales();
		}
		//평균 판매액 계산
		for(int i=0;i<this.number;i++) {
			this.averageSales += team[i].getSales();
		}
		this.averageSales /= this.number;
	}
	public Salesman getBestClerk() {
		Salesman max = null;
		for(int i=0;i<this.number;i++) {
			if(team[i].getSales()==hightestSales)
				max = team[i];
		}
		return max;
	}

	@Override
	public String toString() {
		String str = "총 팀원 수: "+ this.number;
		str += "\n최고판매액: "+ this.hightestSales;
		str += "\n평균판매액: "+ this.averageSales;
		str += "\n----------------\n";
		for(int i=0;i<this.number;i++) {
			str += team[i]+"\n"; 
		}
		
		return str;
	}
	
}
