package dynamic_programming;

import java.util.Scanner;

public class No9461 {

	static long[] num;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		while(sc.hasNext()) {
			int n=sc.nextInt();
			num=new long[n+1];
			System.out.println(re(n));
		}
	}
	static long re(int n) {
		if(n<=3) return num[n]=1;
		if(num[n]!=0) return num[n];
		return num[n]=re(n-2)+re(n-3);
	}
}