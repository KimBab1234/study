import java.util.Scanner;

public class No1330 { //indexof 라는 좋은 기능이 있었다

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine(); //일단 문자열로 받아옴
		
		int temp = str.indexOf(" "); //띄어쓰기 찾아서 해당 인덱스 반환~
		int a = Integer.parseInt(str.substring(0,temp));
		int b = Integer.parseInt(str.substring(temp+1,str.length()));
		
		if(a>b) {System.out.printf(">");}
		else if(a<b) { System.out.printf("<");}
		else { System.out.printf("==");}

	}

}
