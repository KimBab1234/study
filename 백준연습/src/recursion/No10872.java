package recursion;

import java.util.Scanner;

public class No10872 {

	public static void main(String[] args) {

		System.out.println(re(new Scanner(System.in).nextInt()));
	}
	public static int re(int i) {
		if(i==0) return 1;
		return re(i-1)*i;
	}
}
