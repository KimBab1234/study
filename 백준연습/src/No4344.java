

import java.util.Scanner;

public class No4344 { //220915 clear

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(), sum=0, num, avg=0;
		
		for(int i=0;i<cnt;i++) {
			num = sc.nextInt();
			int[] score = new int[num];
			
			for(int j=0; j<num;j++) {
				score[j]=sc.nextInt();
				sum += score[j];
			}
			for(int j=0; j<num;j++) {
				if(score[j] > (sum/num)) {
					avg++;
				}
			}
			System.out.printf("%.3f%%%n",(double)avg/num*100);
			sum = avg=0;
			
		}
	}

}
