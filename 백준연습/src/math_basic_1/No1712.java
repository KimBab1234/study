package math_basic_1;

import java.util.Scanner;

public class No1712 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt(), num2=sc.nextInt(), num3=sc.nextInt();
		System.out.println(num2>=num3? -1 : num1/(num3-num2)+1);
	}
}
