import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String aaa = input.nextLine();
		
		char ch1 = aaa.charAt(0);
		int a = ch1-'0';
		
		ch1 = aaa.charAt(2);
		int b = ch1-'0';
		
		double temp = (double)a/b;
		
		String str = String.valueOf(temp);
		
		char[] ch = str.toCharArray();
		
		int cnt=0;
		
		for(int temp1 = ch.length-1; temp1>-1; temp1--)
		{
			if(ch[temp1]=='0') { cnt++; }
			else {break;}
		}
		
		String str2= str.substring(0, ch.length-cnt);
		System.out.printf("%s",str2);

				
		
	}
}
