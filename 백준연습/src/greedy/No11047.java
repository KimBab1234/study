package greedy;

import java.util.Scanner;

public class No11047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt(), sum=0;
		int[] coin= new int[n];
		for(int i=0; i<n; i++) {
			coin[i]=sc.nextInt();
		}
		for(int j=n-1; j>-1; j--) {
			sum += m/coin[j];
			m %= coin[j];
		}
		
	}
}