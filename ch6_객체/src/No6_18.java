import java.util.Scanner;

public class No6_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

	}
	
	public static boolean isNumber(String str) {
		
		boolean bl=true;
		
		for(int cnt=0; cnt<str.length(); cnt++) {
			
			if(str.charAt(cnt) >=48 && str.charAt(cnt)<=57) {}
			else {bl=false; break;} //하나라도 문자가 나오면 break
		}
		
		
		
		return bl;
	}

}
