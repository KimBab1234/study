package string1;

import java.util.Scanner;

public class No2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt=sc.nextInt(), cnt1;
		for(int i=0; i<cnt;i++) {
			cnt1=sc.nextInt();
			String str= sc.next();
			for(int j=0; j<str.length();j++) {
				for(int k=0; k<cnt1; k++) {
					System.out.printf("%c",str.charAt(j)); //string을 굳이 char배열로 안뿌리고 바로 charAt메서드쓰기
				}
			}
			System.out.printf("%n");
		}

	}
}
