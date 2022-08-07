import java.util.Scanner;

public class Star {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int total = input.nextInt();

		StringBuilder str = new StringBuilder();


		for(int cnt=0; cnt<total; cnt++) {

			if(cnt==0) { //초기 문장 생성

				for(int x=0; x<total-1; x++) { str.append(' '); }
				str.append("*");

			}
			else {

				str.append("*");
				str.deleteCharAt(0);
			}

			System.out.println(str.toString()); //출력

		}
	}

}
