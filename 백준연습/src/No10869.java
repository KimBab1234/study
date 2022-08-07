import java.util.Scanner;

public class No10869 { //사칙연산이지만 1<= A,B <= 10000 으로 범위가 넓어진 문제

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine(); //일단 문자열로 받아옴
		
		char[] ch = str.toCharArray(); //치환된 string을 char 배열로 풀어줌 이유 : 입력 범위가 10000까지니까
		
		int temp=0;
		
		for(temp = 0; temp< ch.length; temp++) //한칸씩 확인하며 띄어쓰기 나오는 자리 확인
		{
			if(ch[temp]==' ') { break;}
		}
		
		
		String str1 = str.substring(0, temp);
		String str2 = str.substring(temp+1, str.length());
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
		System.out.printf("%d%n",a+b);
		System.out.printf("%d%n",a-b);
		System.out.printf("%d%n",a*b);
		System.out.printf("%d%n",a/b);
		System.out.printf("%d%n",a%b);

	}

}
