package graph;

import java.util.*;

public class No2606 {

	static int[][] graph;
	static boolean[] visited;
	static int sum, com;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		com = sc.nextInt()+1;
		int N = sc.nextInt();
		
		visited = new boolean[com];
		graph = new int[com][com];
		
		for(int i=0; i<N; i++) {
			int s= sc.nextInt(), e = sc.nextInt();
			graph[s][e]=1;
			graph[e][s]=1;
		}
		bfs(1);
		System.out.println(sum-1);
	}
	
	static void bfs(int r) {
		for(int i=1; i<com; i++) {
			if(graph[r][i]>0 && !visited[r]) {
				sum++;
				visited[r]=true;
				bfs(i);
			}
		}
	}
}