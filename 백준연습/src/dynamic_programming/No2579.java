package dynamic_programming;

import java.util.Scanner;

public class No2579 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] dp = new int[n+2][2];
		for(int i=2; i<n+2; i++) {
			int a= sc.nextInt();
			dp[i][0]=dp[i-1][1]+a;
			dp[i][1]=Math.max(dp[i-2][0],dp[i-2][1])+a;
		}
		System.out.println(Math.max(dp[n+1][0],dp[n+1][1]));
	}
}