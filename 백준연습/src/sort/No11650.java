package sort;

import java.util.*;

public class No11650 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] n = new int[sc.nextInt()][2], a= new int[n.length][2];
		int i=0;
		StringTokenizer st;
		
		while(sc.hasNext()) {
			st= new StringTokenizer(sc.next());
			n[i][0] = Integer.parseInt(st.nextToken());
			n[i][1] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		
		
		
	}
	static void merge(int[][] arr, int s, int e) {
		if(e==s) return;
		int m=(e-s)/2;
		
		merge(arr, s, m);
		merge(arr, m+1, e);
		sort(arr, s, m, e);
		
	}
	static void sort(int[][] arr, int s, int m, int e) {
//		if(arr[s][0]>arr[e][0]) 
	}
}