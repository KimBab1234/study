package math_basic_2;

import java.util.Scanner;

public class No4948 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num=1, sum=0;
		boolean[] chk = new boolean[246913];
		for(int i=2; i<246913; i++) {
			for(int j=2; i*j<246913; j++) {
				chk[i*j]=true;
			}
		}
		while(true) {
			num=sc.nextInt();
			sum=0;
			if(num==0)break;
			for(int i=num+1; i<=2*num; i++) {
				if(chk[i]==false) sum++;
			}
			System.out.println(sum);
		}
	}
}
