package math_basic_2;

import java.util.Scanner;

public class No11653 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt(), i, j, k=num;
		loop:
		for(i=2; i<num+1;i++) {
			for(j=2; j<i; j++) {
				if(i%j==0) continue loop;
			}
			while(k%i==0) {
				k/=i;
				System.out.println(i);
				if(k<i) break loop;
			}
		}
	}
}
