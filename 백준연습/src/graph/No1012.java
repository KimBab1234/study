package graph;

import java.util.Scanner;

public class No1012 {

	static int[][] graph;
	static boolean area;
	static int xM, yM, count=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			xM=sc.nextInt();
			yM=sc.nextInt();
			graph=new int[xM][yM];
			int M = sc.nextInt();
			for(int j=0; j<M; j++) {
				graph[sc.nextInt()][sc.nextInt()] = 1;
			}
			
			for(int j=0; j<xM; j++) {
				for(int k=0; k<yM; k++) {
					if(graph[j][k]>0) {
						count++;
						area = true;
						dfs(j, k);
						area=false;
					}
				}
			}
			System.out.println(count);
			count=0;
		}
	}
	static void dfs(int x, int y) {
		
		int[] xNext= {x-1, x+1, x, x}, yNext= {y, y, y-1, y+1};
		
		for(int i=0; i<4; i++) {
			int xN=xNext[i], yN=yNext[i];
			if(xN>=0 && xN<xM && yN>=0 && yN<yM) {
				if(graph[xN][yN]==1) {
					graph[xN][yN]=0;
					dfs(xN, yN);
				}
			}
		}
	}
}