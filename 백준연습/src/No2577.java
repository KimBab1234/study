import java.util.Scanner;

public class No2577 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int A=input.nextInt();
		int B=input.nextInt();
		int C=input.nextInt();

		int total = A*B*C;
		String str = ""+total;
		int[] num = new int[10];
		int cnt=0;
		
		while(cnt<str.length()) {
			num[str.charAt(cnt)-'0']++;
			cnt++;
		}
		cnt=0;
		while(cnt<10) {
			System.out.println(num[cnt]);
			cnt++;
		}
		
		input.close();
		
	}

}
