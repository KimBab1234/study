import java.util.Scanner;

public class No6_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.printf("입력 : %d, 절대값 : %d",x,abs(x));
		

	}
	
	public static int abs(int value) {
		
		
		if(value>=0) { return value;}
		else { return value *= -1;}
		////한줄로 고치면 return value>=0 ? value : -value; => 간단한 if문은 이렇게 쓰자
	}
	
	

}
