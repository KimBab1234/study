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
		
		visited1 = new boolean[N]; //DFS를 위한 방문 확인 배열
		visited2 = new boolean[N]; //BFS를 위한 방문 확인 배열
		
		graph= new int[N][N]; //GRAPH 담을 2차원배열
		
		for(int i=0; i<M; i++) {
			int s=sc.nextInt(), e=sc.nextInt();
			graph[s][e]=1; //무방향 그래프니까 방향성이 없음!
			graph[e][s]=1; //양쪽에서 왔다갔다 할 수 있으니 양쪽 다 1을 넣어준다 
		}
		
		sb = new StringBuilder();
		dfs(V);
		sb.append("\n");
		cnt=1;
		bfs(V);
		
		System.out.println(sb.toString());
		
	}
	
	static void dfs(int r) {
		
		if(visited1[r]) return; //고갱님 이미 방문하셨어요~ 돌아가세요~~
		
		visited1[r] = true; //방문 해주셔서 감사합니다 true 체크!!
		sb.append(r+" "); //방문했으니 만들어둔 StringBuilder에 현재 지점 발도장 찍기
		
		for(int i=1; i<N; i++) { //현재 노드의 배열 한칸씩 돌면서
			if(graph[r][i]>0) { //연결된 지점이 있으면?
				dfs(i); //그 지점 방문해보기!!
			}
		}
		
	}
	
	static void bfs(int r) {
		
		Queue<Integer> queue = new LinkedList<>(); //방문할 노드들을 순서대로 담을 Queue 생성
		queue.add(r); //root노드부터 방문할 거니까 1번째로 담아주기!
		
		visited2[r] = true; //queue에 담았으니 true체크하기
		
		while(!queue.isEmpty()) { //queue가 텅 빌 때까지 반복하기
			
			int u = queue.poll(); //다음 노드 나오세요
			sb.append(u+" "); //방문했으니까 발도장 찍기
			
			for(int i=1; i<N; i++) { //현재 노드의 배열을 1부터 돌면서
				if(graph[u][i]>0 && !visited2[i]) { //연결된 지점이 있고 방문도 안했으면?
					queue.add(i); //다음 방문 노드는 너로 정했다 queue로 들어가슈
					visited2[i] = true; //queue에 담았으니 true체크하기
				}
			}
			
		}
		
	}
}