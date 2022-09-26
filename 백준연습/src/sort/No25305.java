package sort;

import java.util.*;

public class No25305 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int a = sc.nextInt(), n=10000;
		int[] cnt = new int[10001];	
		
		while(sc.hasNextInt()) {
			cnt[sc.nextInt()]++;
		}
		while(a>0) {
			a-=cnt[n];
			n--;
		}
		System.out.println(n+1);
	}
}
