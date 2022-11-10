package dynamic_programming;

import java.util.Scanner;

public class No1932 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), max=0;
		int[][] rec= new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				int a=sc.nextInt();
				if(j==0) rec[i][0]=rec[i-1][0]+a;
				else if(j==i) rec[i][j]=rec[i-1][j-1]+a;
				else rec[i][j]+=Math.max(rec[i-1][j-1], rec[i-1][j])+a;
				if(i==n) max=Math.max(max,rec[i][j]);
			}
		}
		System.out.println(max);
	}
}