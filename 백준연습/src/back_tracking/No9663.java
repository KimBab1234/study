package back_tracking;

import java.util.Scanner;

public class No9663 {

	static int n, sum=0;
	static int[] col;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		col=new int[n];
		re(0);
		System.out.println(sum);

	}
	static void re(int row) {
		if(row==n) {
			sum++;
			return;
		}
		for(int i=1; i<=n; i++) {
			
		}
		
	}
}
