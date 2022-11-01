package back_tracking;

import java.util.Scanner;

public class No15651 {

	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();

		re("",0);
		System.out.print(sb.toString());
	}
	static void re(String str, int cnt) {
		if(cnt==m) {
			sb.append(str).append("\n");
			return;
		}
		for(int i=1; i<=n; i++) {
			re(str+i+" ", cnt+1);
		}
	}
}
