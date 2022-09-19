import java.util.Scanner;

public class No1065 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt, num=sc.nextInt();
		
		if(num<100) {
			cnt=num;
		} else {
			cnt=99;
			for(int i=100; i<=num;i++) {
				if(((i%100)/10 - i%10) == (i/100 - (i%100)/10)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
