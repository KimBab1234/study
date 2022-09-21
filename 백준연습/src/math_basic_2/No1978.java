package math_basic_2;

import java.util.Scanner;

public class No1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt=sc.nextInt(), sum=0, num;
		loop:
		for(int i=0; i<cnt; i++) {
			num=sc.nextInt();
			if(num==1) continue;
			for(int j=2; j<num; j++) {
				if(num%j==0) continue loop;
			}
			sum++;
		}
		System.out.println(sum);
	}
}
