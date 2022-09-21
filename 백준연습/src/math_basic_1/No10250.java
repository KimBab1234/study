package math_basic_1;

import java.util.Scanner;

public class No10250 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(), h, w, n;
		
		for(int i=0; i<cnt; i++) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			System.out.printf("%d%02d%n",n%h==0 ? h : n%h,n%h==0 ? n/h : n/h+1);
		}
	}
}
