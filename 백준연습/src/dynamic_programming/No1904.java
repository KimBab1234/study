package dynamic_programming;

import java.util.Scanner;

public class No1904 {

	static int[] num;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		num=new int[n+1];
		System.out.println(re(n));
	}
	static int re(int n) {
		if(n==1) return num[n]=1;
		if(n==2) return num[n]=2;
		if(num[n]!=0) return num[n]%15746;
		return num[n]=(re(n-2)+re(n-1));
	}
}