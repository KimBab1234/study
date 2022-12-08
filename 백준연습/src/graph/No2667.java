package graph;

import java.util.*;

public class No2667 {

	static char[][] graph; 
	static int N, total=0;
	static List<Integer> count=new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		graph = new char[N][N];
		
		for(int i=0; i<N; i++) {
			graph[i]=sc.next().toCharArray();
		}
		
		for(int i=0; i<N; i++) { //graph 한칸씩 순회시작
			for(int j=0; j<N; j++) {
				if(graph[i][j]=='1') { //만약 1이면
					total++; //갯수 1개 올리고
					graph[i][j]='0'; //방문했단 의미로 0 넣어주기
					dfs(i,j); //dfs 보냄
					//dfs에서 돌아왔다는 건 영역 다 돌았다는 뜻이니...
					count.add(total); //list에 total 넣어주고
					total=0; //초기화 해줌
				}
			}
		}
		System.out.println(count.size()); //총 영역 갯수는 size로 출력
		Collections.sort(count); //오름차순 정렬해서
		for(int i:count) {
			System.out.println(i); //하나씩 출력하기
		}
	}
	
	static void dfs(int x, int y) {
		
		//상하좌우 탐색을 위해 미리 x,y 좌표 배열 만들어주기
		int[] xNext= {x-1, x, x+1, x};
		int[] yNext= {y, y-1, y, y+1};
		
		//탐색 시작
		for(int i=0; i<4; i++) {
			int xN = xNext[i], yN = yNext[i];
			//x,y좌표가 0~N 사이인경우만 탐색
			if(xN>=0 && xN<N && yN>=0 && yN<N) {
				if(graph[xN][yN]=='1') { //상하좌우 중에 1인 칸이 있다면
					total++; //total 1개 올리고
					graph[xN][yN]='0'; //방문했단 의미로 0 넣고
					dfs(xN, yN); //해당 칸으로 가서 다시 탐색 시작
				}
			}
		}
	}
	
}