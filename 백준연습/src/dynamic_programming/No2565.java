package dynamic_programming;

import java.util.Scanner;

public class No2565 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), mmax=0, result=0, m;
		int[] arr = new int[501], dp=new int[501];
		for(int i=0; i<n; i++) {
			m=sc.nextInt();
			arr[m] =sc.nextInt(); 
			if(m>mmax) mmax=m;
		}
		for(int i=0; i<=mmax; i++) {
			m=arr[i];
			if(m>0) {
				int max=0;
				for(int j=1; j<m; j++) {
					max=dp[j]>max? dp[j]:max;
				}
				dp[m]=Math.max(dp[m], max+1);
				result=Math.max(dp[m], result);
			}
		}
		System.out.println(n-result);
	}
}