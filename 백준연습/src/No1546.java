

import java.util.Scanner;

public class No1546 {

	public static void main(String[] args) {

		//************1546번 220915************

		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt(); //총과목수
		sc.nextLine();

		int sum=0, max =0, temp=0;

		for(int i=0; i<cnt;i++) {
			temp = sc.nextInt();
			sum += temp;
			if(max<temp) {
				max = temp;
			}
		}

		System.out.println((double)sum/max*100/cnt);
		sc.close();

	}

}
