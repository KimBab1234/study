import java.util.Scanner;

public class No3003 { //숫자 6개 입력받은 뒤 부족하거나 과한 갯수 빼기
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		String str = input.nextLine(); //일단 문자열로 받아옴

		char[] ch = str.toCharArray(); //char 배열로 풀어줌

		int cnt=0; int start = 0; int i=0;
		String[] chessnum = new String[6]; //킹, 퀸, 룩, 비숍, 나이트, 폰 6개 string
		int[] chessint = new int[6]; //킹, 퀸, 룩, 비숍, 나이트, 폰 6개 int로 변환할곳
		int[] minus = {1,1,2,2,2,8};

		for(cnt=0; cnt<ch.length; cnt++){

			if(ch[cnt]==' ' || i==5) {

				if(i==5) { chessnum[i] = str.substring(start, ch.length); }
				else {chessnum[i] = str.substring(start, cnt);}

				chessint[i] = Integer.parseInt(chessnum[i]);
				start = cnt+1; //시작위치 저장
				i++; //다음 체스말로 종류 넘어가기
			}

		}

		for(cnt=0; cnt<6; cnt++) {

			System.out.printf("%d",minus[cnt]-chessint[cnt]);
			if(cnt<5) {System.out.printf(" ");}

		}
	}
}
