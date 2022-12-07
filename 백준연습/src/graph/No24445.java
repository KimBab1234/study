package graph;

import java.io.*;
import java.util.*;

public class No24445 {

	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static Queue<Integer> queue = new LinkedList<>();
	static int[] visited;
	static int count=1;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		visited = new int[N+1];
		for(int i=0; i<=N; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int s =Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			graph.get(s).add(e);
			graph.get(e).add(s);
		}
		
		for(int i=1; i<=N; i++) {
			Collections.sort(graph.get(i));
			Collections.reverse(graph.get(i));
		}
		
		bfs(R);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			sb.append(visited[i]+"\n");
		}
		System.out.println(sb.toString());
		
	}
	
	static void bfs(int v) {
		
		if(visited[v]==0) {
			queue.add(v);
			visited[v] =count++;
		}
		while(!queue.isEmpty()) {
			int u = queue.poll();
			
			for(int i : graph.get(u)) {
				if(visited[i]==0) {
					queue.add(i);
					visited[i] =count++;
				}
			}
		}
		
	}
}