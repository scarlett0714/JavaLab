package week03.yshwang.konkuk;

public class YShwangLab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202110547 황윤선");
		String[] name = new String[] {"홍길동", "고길동", "김길동", "이길동"};
		int[][] score = new int[][] {
			{10,20,30,0}, 
			{20,30,40,0},
			{10,25,30,0},
			{30,30,40,0} };
			
		for(int arr[] : score) {
			for(int i=0; i<arr.length-1; i++) {
					arr[arr.length-1] += arr[i];
			}
		}
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+" >> ");
			int k =0;
			for(int j : score[i]) {
				if(k==3)
					System.out.print(": ");
				System.out.print(j+" "); 
				k++;
				}
			
			System.out.print(": ");
			
			int[] rank = new int[] {4,3,2,1};
			int l;
			for(l=0;l<score.length-1;l++) {
				int minIndex = l;
				for(int j=(l+1);j<score.length;j++) 
				{
					if(score[j][3]<score[minIndex][3]) 
					{
						minIndex = j;
					}
				}
					if(minIndex != l)
					{
						int temp = rank[minIndex];
						rank[minIndex] = rank[l];
						rank[l] = temp;
					}
			}
			System.out.println(rank[i]);
		}
		
	}
}

