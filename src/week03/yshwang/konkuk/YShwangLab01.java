package week03.yshwang.konkuk;

import java.util.Random;

public class YShwangLab01 {

	public static void main(String[] args) {
		System.out.println("202110547 황윤선");
		
		int[] lotto = makeLotto();
		
		for(int i=0;i<lotto.length-1;i++)
		{
			int minIndex = i; 
			for(int j=(i+1);j<lotto.length;j++) 
			{
				if(lotto[j]<lotto[minIndex]) 
				{
					minIndex = j;
				} 
			}
				if(minIndex != i) 
				{
					lotto[i] = lotto[i]^lotto[minIndex];
					lotto[minIndex] = lotto[i]^lotto[minIndex];
					lotto[i] = lotto[i]^lotto[minIndex];
					
				}
		}
		
		System.out.print("로또 번호 : ");
		for(int i : lotto)
			System.out.print(i+" ");
		System.out.println();
		
	}

	private static int[] makeLotto() {
		int[] lotto = new int[6];
		Random rand = new Random();
		
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = rand.nextInt(45) +1; 
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			
			}
		}
		return lotto;
	}

}
