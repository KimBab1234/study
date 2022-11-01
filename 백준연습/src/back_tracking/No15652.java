package back_tracking;

import java.util.Scanner;

public class No15652 {

	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();

		re("",0,1);
		System.out.println(sb.toString());
	}
	static void re(String str, int cnt, int s) {
		if(cnt==m) {
			sb.append(str).append("\n");
			return;
		}
		for(int i=s; i<=n; i++) {
			re(str+i+" ", cnt+1, i);
		}
	}
}