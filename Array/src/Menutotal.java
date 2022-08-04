import java.util.Scanner;

import javax.swing.MenuSelectionManager;

public class Menutotal {

	public static void main(String[] args) {


		int[][] price = {{ 8000, 7000, 6500, 5500, 4500 },
				{ 7500, 9500, 10000, 8500, 8000 },
				{ 1000, 2000, 500, 500, 500}};

		String[][] engg = { {"육회비빔밥", "돌솥비빔밥", "돼지불백", "김치찌개", "된장찌개"},
				{"토마토파스타", "해산물 토마토파스타", "해산물 크림파스타", "로제파스타", "크림파스타"},
				{"음료 캔", "음료 페트", "단무지", "김치", "치즈 추가"}};
		int total=0;
		String menusum = "";

		System.out.printf("========메뉴판========%n");

		Menuselect: while(true) {
			System.out.printf("1. 한식 2. 양식 3. 사이드%n");
			System.out.printf("원하는 메뉴를 입력하세요. (계산 종료는 99번)");
			Scanner scan1 = new Scanner(System.in);
			int usermenu = scan1.nextInt();

			if(usermenu==99) {break;}

			for(int cnt=0; cnt<price[usermenu-1].length; cnt++) {

				System.out.printf("%d. %s : %d원%n",cnt+1,engg[usermenu-1][cnt],price[usermenu-1][cnt]);
			} //메뉴판 출력
			
			while(true) {

				System.out.printf("원하는 메뉴를 입력하세요. (이전 화면은 9번, 계산 종료는 99번)%n");
				Scanner scan2 = new Scanner(System.in);
				int tempmenu = scan2.nextInt();

				if(tempmenu==9) {break;}
				else if(tempmenu==99) { break Menuselect;}
				else { 
					total += price[usermenu-1][tempmenu-1];
					menusum = menusum+ " "+ engg[usermenu-1][tempmenu-1];
					System.out.printf("%s를 선택하셨습니다. 현재 금액 합계 %d원입니다.%n", engg[usermenu-1][tempmenu-1],total);
				}


			}


		}
		
		System.out.printf("=======계산 종료======%n");
		System.out.printf("선택하신 메뉴 확인 바랍니다.%n");
		System.out.printf("%s %n",menusum);
		System.out.printf("총 금액은 %d원입니다.%n",total);
		
	}

}
