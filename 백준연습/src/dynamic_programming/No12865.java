package dynamic_programming;

import java.util.*;

public class No12865 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt(), i=n, j=0, w=0, v=0, max=0;
		int[][] arr= new int[n][2];
		for(j=0; j<n; i++) { arr[j][1]=sc.nextInt(); arr[j][0]=sc.nextInt();}
		Arrays.sort(arr);
		while(i-->0) {
			j=i;
			while(j-->0) {
				if(k<w+arr[i][0]) {
					max=Math.max(max, v);
					break;
				}
				v+=arr[i][1];
				w+=arr[i][0];
			}
		}
		System.out.println(max);
	}
}