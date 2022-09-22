package math_basic_2;

import java.util.Scanner;

public class No9020 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt=sc.nextInt(),num;

		for(int i=0; i<cnt;i++) {
			num=sc.nextInt();
			loop:
				for(int j=num/2; j>=2; j--) {
					for(int k=2; k<=Math.sqrt(num-j); k++) {
						if(j%k==0 || (num-j)%k==0) continue loop;
					}
					System.out.printf("%d %d%n",j,num-j);
					break;
				}
		}
	}
}
