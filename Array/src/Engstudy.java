import java.util.Scanner;

public class Engstudy {

	public static void main(String[] args) {

		String[][] engg = {{"Apple", "사과"},
						   {"Banana", "바나나"},
						   {"Cat", "고양이"},
						   {"Dolphin", "돌고래"},
						   {"Egg", "달걀"},
						   {"Fish", "물고기"}};

		int cnt=0;
		for(cnt=0; cnt<engg.length; cnt++) {
		
			while(true) {
				System.out.printf("%d. %s의 뜻을 맞혀보세요.%n",cnt+1,engg[cnt][0]);
				Scanner scan1 = new Scanner(System.in);
				String userinput = scan1.nextLine(); //입력받은답

				if(userinput.equals(engg[cnt][1])) {System.out.printf("정답입니다!%n"); break;}
				else {System.out.printf("틀렸습니다. 다시 입력하세요.%n");}
			}

		}

	}
}
