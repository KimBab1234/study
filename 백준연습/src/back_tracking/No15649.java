package back_tracking;

import java.util.Scanner;

public class No15649 {
	
	static boolean[] visit;
	static int[] num;
	static int n, m;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		visit=new boolean[n];
		
		re("",0);
	}
	static void re(String str,  int cnt) {
		if(cnt==m) {
			System.out.println(str);
			return;
		}
		for(int i=1; i<=n; i++) {
			if(!visit[i-1]) {
				visit[i-1]=true;
				re(str+i+" ",cnt+1);
				visit[i-1]=false;
			}
		}
	}
}