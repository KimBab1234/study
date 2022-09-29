package recursion;

import java.util.Scanner;

public class No10870 {
	public static void main(String[] args) {

		System.out.println(re(new Scanner(System.in).nextInt()));
	}
	public static int re(int k) {

		if(k<2) return k;
		else return re(k-1) + re(k-2);
	}
}
