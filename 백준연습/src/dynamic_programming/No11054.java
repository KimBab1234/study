package dynamic_programming;

import java.util.Scanner;

public class No11054 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr=new int[3][1001];
		int n=sc.nextInt(), mmax=0, result=0;
		for(int i=0; i<n; i++) arr[0][i]=sc.nextInt();
		for(int i=0; i<n; i++) {
			int max=0, m=arr[0][i];
			for(int j=0; j<i; j++) {
				if(arr[0][j]<arr[0][i]) {
					max=arr[1][j]>max? arr[1][j]:max;
				}
			}
			arr[1][i]=Math.max(max+1, arr[1][i]);
		}
		for(int i=n-1; i>-1; i--) {
			int max=0, m=arr[0][i];
			for(int j=n; j>i; j--) {
				if(arr[0][j]<arr[0][i]) {
					max=arr[2][j]>max? arr[2][j]:max;
				}
			}
			arr[2][i]=Math.max(max+1, arr[2][i]);
			mmax=arr[2][i]+arr[1][i]-1;
			result=mmax>result?mmax:result;
		}
		System.out.println(result);
	}
}