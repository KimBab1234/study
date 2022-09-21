package math_basic_1;

import java.util.Scanner;

public class No2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt(), cnt=0, sum=0;
		while((num-1) > 6*sum) {
			cnt++;
			sum += cnt;
		}
		System.out.println(cnt+1);
	}
}
