import java.util.Scanner;

public class Rocksci {

	public static void main(String[] args) {
		
		String[] gbb = {"가위", "바위", "보"};
		
		System.out.printf("1.가위  2.바위 3.보 중에 선택하세요.");
		Scanner scan1 = new Scanner(System.in);
		int userinput = scan1.nextInt(); //입력받은 숫자
		
		int rannum = (int)(Math.random()*3); //컴퓨터가 정한 숫자

		switch(userinput-1)
		{
			case 0: {
			if(rannum==0) {System.out.printf("비겼습니다. 내가 낸 것: %s 컴퓨터가 낸 것: %s",gbb[userinput-1],gbb[rannum]);}
			if(rannum==1) {System.out.printf("이겼습니다. 내가 낸 것: %s 컴퓨터가 낸 것: %s",gbb[userinput-1],gbb[rannum]);}
			if(rannum==2) {System.out.printf("졌습니다. 내가 낸 것: %s 컴퓨터가 낸 것: %s",gbb[userinput-1],gbb[rannum]);}
			break;
			}
			case 1: {
				if(rannum==1) {System.out.printf("비겼습니다. 내가 낸 것: %s 컴퓨터가 낸 것: %s",gbb[userinput-1],gbb[rannum]);}
				if(rannum==0) {System.out.printf("이겼습니다. 내가 낸 것: %s 컴퓨터가 낸 것: %s",gbb[userinput-1],gbb[rannum]);}
				if(rannum==2) {System.out.printf("졌습니다. 내가 낸 것: %s 컴퓨터가 낸 것: %s",gbb[userinput-1],gbb[rannum]);}
				break;
			}
			case 2: {
				if(rannum==2) {System.out.printf("비겼습니다. 내가 낸 것: %s 컴퓨터가 낸 것: %s",gbb[userinput-1],gbb[rannum]);}
				if(rannum==1) {System.out.printf("이겼습니다. 내가 낸 것: %s 컴퓨터가 낸 것: %s",gbb[userinput-1],gbb[rannum]);}
				if(rannum==0) {System.out.printf("졌습니다. 내가 낸 것: %s 컴퓨터가 낸 것: %s",gbb[userinput-1],gbb[rannum]);}
				break;
			}
			
		}


	}

}
