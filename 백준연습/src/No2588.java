import java.util.Scanner;

public class No2588 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		int c = b%10; //1의 자리숫자
		int d = (b-c)%100; //10의 자리 숫자
		int e = b/100; //100의 자리 숫자
		
		System.out.println(a*c);
		System.out.println(a*d/10);
		System.out.println(a*e);
		System.out.println(a*b);
		
	}
}
