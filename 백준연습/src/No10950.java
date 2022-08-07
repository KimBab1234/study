import java.util.Scanner;

public class No10950 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int total= input.nextInt();
		input.nextLine(); //개행문자 제거
		int[] num = new int[total*2];
		int cnt=0;
		
		for(cnt=0; cnt<total*2; cnt+=2) {
			num[cnt]=input.nextInt();
			num[cnt+1]=input.nextInt();
			input.nextLine();
		} //입력 미리 받아온 뒤에 출력하기
		
		for(cnt=0; cnt<total*2; cnt+=2) {
			System.out.printf("%d%n",num[cnt]+num[cnt+1]); 			
		} //입력받아오기

	}



}
