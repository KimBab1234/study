package math_basic_2;

import java.util.Scanner;

public class No11653 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt(),i;
		for(i=2; i<k+1;i++) {
			while(k%i==0) {
				k/=i;
				System.out.println(i);
			}
		}
	}
}
