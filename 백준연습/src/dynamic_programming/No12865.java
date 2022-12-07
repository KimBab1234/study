package dynamic_programming;

import java.util.Scanner;

public class No12865 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), maxK=sc.nextInt(), maxV=0;
		int[][] arr=new int[101][2];
		int[][] dp=new int[101][101];
		for(int i=0; i<n; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		re(0,0,0);
		System.out.println(maxV);

	}
	static void re(int depth, int w, int v) {
//		if(w>maxK) return;
//		if(v>maxV) maxV=v;
//		if(depth>n) return;
//		for(int i=depth; i<n; i++) {
//			if(!chk[i]) {
//				chk[i]=true;
//				re(depth+1, w+arr[i][0], v+arr[i][1]);
//				chk[i]=false;
//			}
//		}
	}
}