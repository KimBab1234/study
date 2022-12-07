package dynamic_programming;

import java.util.Scanner;

public class No9251 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1=sc.next(), s2=sc.next();
		int[][] dp = new int[1001][1001];
		int max=0, n=0;
		for(int i=1; i<=s1.length(); i++) {
			for(int j=1; j<=s2.length(); j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					n=dp[i-1][j-1]+1;
				} else {
					n=Math.max(dp[i][j-1], dp[i-1][j]);
				}
				dp[i][j]=n;
				max=Math.max(max, n);
			}
		}
		System.out.println(max);
	}
}