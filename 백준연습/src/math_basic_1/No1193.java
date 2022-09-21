package math_basic_1;

import java.util.Scanner;

public class No1193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt(), cnt=1, sum=1;
		while(num > sum) {
			cnt++;
			sum += cnt;
		}
		System.out.println((cnt%2==0)? (cnt-(sum-num))+"/"+(sum-num+1) : (sum-num+1)+"/"+(cnt-(sum-num)));
		
	}

}
