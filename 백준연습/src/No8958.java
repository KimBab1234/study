

import java.util.Scanner;

public class No8958 { //220915 clear

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(), temp, sum;
		String str;
		
		for(int i=0; i<cnt;i++) {
			temp = sum = 0;
			str = sc.next();
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='O') {
					temp += 1;
					sum += temp;
				} else {
					temp = 0;
				}
			}
			System.out.println(sum);
		}
		
		
	}

}
