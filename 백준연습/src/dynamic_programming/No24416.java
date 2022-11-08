package dynamic_programming;

import java.util.Scanner;

public class No24416 {

	static int cnt=0, cnt1=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		fib(n);
		fibonacci(n);
		System.out.print(cnt+" "+cnt1);
	}
	static int fib(int n) {
	    if (n==1||n==2) {
	    	cnt++;
	    	return 1;
	    } else return (fib(n-1) + fib(n-2));
	}
	static int fibonacci(int n) {
		int[] f=new int[n+1];
		if (n<=2) {
	    	return 1;
	    } else {
	    	for(int i=3; i<=n; i++) {
	    		cnt1++;
	    		f[i]=f[i-1]+f[i-2];
	    	}
	    	return f[n];
	    }
	}
}