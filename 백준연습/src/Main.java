import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		for(char i=97; i<123;i++) {
			System.out.printf("%d ",str.indexOf(i));
		}
	}
}
