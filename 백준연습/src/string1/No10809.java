package string1;
import java.util.Scanner;

public class No10809 { 

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		for(char i=97; i<123;i++) {
			System.out.printf("%d ",str.indexOf(i)); //indexof : 문자열 앞에서부터 특정단어를 찾아줌
		}
	}
}
