package dynamic_programming;

import java.util.Scanner;

public class No11053 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1001];
		int n=sc.nextInt(), mmax=0;
		for(int i=0; i<n; i++) {
			int m=sc.nextInt(), max=0;
			for(int j=1; j<m; j++) {
				max=arr[j]>max? arr[j]:max;
			}
			arr[m]=max+1;
			if(arr[m]>mmax) mmax=arr[m];
		}
		System.out.println(mmax);
		
	}
}