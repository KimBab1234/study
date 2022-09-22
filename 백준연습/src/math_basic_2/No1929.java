package math_basic_2;

import java.util.Scanner;

public class No1929 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		boolean[] chk = new boolean[n2+1];
		for(int i=2; i<=n2; i++) {
			if(i>=n1 && !chk[i]) {
				System.out.println(i);
			}
			for(int j=2*i; j<=n2; j+=i) {//미리 i의 배수를 배열에 체크
				chk[j]=true;
			}
		}
	}
}
