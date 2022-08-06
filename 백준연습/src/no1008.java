import java.util.Scanner;

public class no1008 { ///A, B 입력받은뒤 소수점 0제거

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String aaa = input.nextLine(); //일단 문자열로 받아옴
		
		char ch1 = aaa.charAt(0); //문자 1개 떼어낸 뒤
		int a = ch1-'0'; //숫자로치환
		
		ch1 = aaa.charAt(2);//동일하게 치환
		int b = ch1-'0';
		
		double temp = (double)a/b; //정밀도를 위해 double 사용
		
		String str = String.valueOf(temp); //double 형태를 string으로 치환
		
		char[] ch = str.toCharArray(); //치환된 string을 char 배열로 풀어줌
		
		int cnt=0;
		
		for(int temp1 = ch.length-1; temp1>-1; temp1--) //한칸씩 확인하며 0이 안나오는 부분 기억하기
		{
			if(ch[temp1]=='0') { cnt++; }
			else {break;}
		}
		
		String str2= str.substring(0, ch.length-cnt); //0 안나오는 부분까지만 복사해와서 출력
		System.out.printf("%s",str2);

				
		
	}
}
