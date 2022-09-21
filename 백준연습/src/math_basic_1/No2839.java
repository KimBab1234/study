package math_basic_1;

import java.util.Scanner;

public class No2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt(),cnt=sum/5,a=-1;
		
		while(cnt > -1) {
			if((sum-5*cnt)%3==0) {
				a= cnt + (sum-5*cnt)/3;
				break;
			}
			cnt--;
		}
		System.out.println(a);
	}
}
