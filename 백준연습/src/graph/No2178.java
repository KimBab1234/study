package graph;

import java.util.*;

public class No2178 {

	static char[][] maze;
	static int xMax,yMax;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		xMax=sc.nextInt();
		yMax=sc.nextInt();
		maze = new char[xMax][yMax]; //숫자가 공백으로 구분되어있지 않아서 char배열로 생성
		
		for(int i=0; i<xMax; i++) {
			maze[i] = sc.next().toCharArray(); //char 배열로 뿌려주기
		}
		
		bfs(); //bfs 메서드 호출
		//제일 마지막칸의 카운팅값 뿌리기 아스키코드 48이 숫자 0이니까 빼줘야함
		System.out.println((int)maze[xMax-1][yMax-1]-48); 
	}

	static void bfs() {

		Queue<coor> q = new LinkedList<>(); //인접한 노드 담을 queue 생성
		q.add(new coor(0, 0)); //첫번째칸인 (0,0) queue에 넣기
		
		//상하좌우 좌표 계산 위한 배열 생성
		int[] xNext = {-1, 1, 0, 0}, yNext={0, 0, -1, 1};
		
		while(!q.isEmpty()) { //queue가 없어질 때까지 실행
			
			coor now = q.poll(); //현재 방문한 노드 좌표 꺼내기
			
			for(int i=0; i<4; i++) { //상하좌우 탐색 시작
				
				int x = now.x+xNext[i], y = now.y+yNext[i];
				
				if(x>=0 && y>=0 && x<xMax && y<yMax) {
					if(maze[x][y]=='1') { //붙어있는 노드가 있다면
						
						//현재 노드에서 +1 해주고(몇 칸 움직였는지 카운팅한 값임)
						maze[x][y]=(char)(maze[now.x][now.y]+1); 
						q.add(new coor(x,y)); //해당 노드 방문을 위해 queue에 추가
					}
				}
			}
		}
	}
}
class coor { //현재 좌표 담을 객체 클래스
	int x, y;
	coor(int x, int y) {
		this.x = x;
		this.y = y;
	}
}