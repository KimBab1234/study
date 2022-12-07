package graph;

import java.util.*;

public class No1260 {
	
	static boolean[] visited1, visited2;
	static int[][] graph;
	static int N, cnt=1;
	static StringBuilder sb;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		N=sc.nextInt()+1;
		int M = sc.nextInt(), V = sc.nextInt();
		
		visited1 = new boolean[N];
		visited2 = new boolean[N];
		
		graph= new int[N][N];
		
		for(int i=0; i<M; i++) {
			int s=sc.nextInt(), e=sc.nextInt();
			graph[s][e]=1;
			graph[e][s]=1;
		}
		
		sb = new StringBuilder();
		dfs(V);
		sb.append("\n");
		cnt=1;
		bfs(V);
		
		System.out.println(sb.toString());
		
	}
	
	static void dfs(int r) {
		if(visited1[r]) return;
		visited1[r] = true;
		sb.append(r+" ");
		for(int i=1; i<N; i++) {
			if(graph[r][i]>0) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int r) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(r);
		visited2[r] = true;
		while(!queue.isEmpty()) {
			int u = queue.poll();
			sb.append(u+" ");
			for(int i=1; i<N; i++) {
				if(graph[u][i]>0 && !visited2[i]) {
					queue.add(i);
					visited2[i] = true;
				}
			}
		}
	}
}