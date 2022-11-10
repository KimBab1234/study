package dynamic_programming;

import java.util.Scanner;

public class No1149 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] dp=new int[n+1][3];
		for(int i=1; i<=n; i++) {
			int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
			dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + a;
			dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + b;
			dp[i][2] = Math.min(dp[i-1][1],dp[i-1][0]) + c;
		}
		System.out.println(Math.min(dp[n][2], Math.min(dp[n][0],dp[n][1])));
	}
}