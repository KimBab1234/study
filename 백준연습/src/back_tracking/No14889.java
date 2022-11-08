package back_tracking;

import java.util.Scanner;

public class No14889 {
	
	static int n,m=4000000;
	static int[][] score;
	static boolean[] chk;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		score=new int[n][n];
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				score[i][j]=sc.nextInt();
			}
		}
		chk=new boolean[n+1];
		chk[0]=true;
		re(1,new int[n/2],1);
		System.out.println(m);
	}
	static void re(int depth, int[] team, int start) {
		if(depth==n/2) {
			int sum=0,j=0;
			int[] team1=new int[n/2];
			for(int i=0; i<n; i++) {
				if(!chk[i]) {
					team1[j++]=i;
				}
			}
			for(int i=0; i<n/2; i++) {
				for(j=0; j<n/2; j++) {
					sum+=(score[team[i]][team[j]])-(score[team1[i]][team1[j]]);
				}
			}
			m= m>Math.abs(sum)?Math.abs(sum):m;
		} else {
			for(int i=start; i<n; i++) {
				if(!chk[i]) {
					team[depth]=i;
					chk[i]=true;
					re(depth+1, team,i+1);
					chk[i]=false;
				}
			}
		}
	}
}