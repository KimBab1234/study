package math_basic_1;

import java.util.Scanner;

public class No2775 {
	
	public static void main(String[] args) {
	
		int[][] n = new int[15][15];
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<15;j++) {
				if(i==0) {
					n[i][j]=j+1;
				} else if(j==0) {
					n[i][j] = 1;
				} else {
					n[i][j] = n[i-1][j] + n[i][j-1];
				}
			}
		}
		Scanner sc = new Scanner(System.in);
		int cnt=sc.nextInt();
		for(int i=0; i<cnt; i++) {
			System.out.println(n[sc.nextInt()][sc.nextInt()-1]);
		}
	}
}
