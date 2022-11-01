package back_tracking;

import java.util.Scanner;

public class No15650 {

	static int n, m;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();

		re("",0,1);
	}
	static void re(String str, int cnt, int s) {
		if(cnt==m) {
			System.out.println(str);
			return;
		}
		for(int i=s; i<=n; i++) {
			re(str+i+" ", cnt+1, i+1);
		}
	}
}
