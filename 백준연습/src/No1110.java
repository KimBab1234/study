import java.util.Scanner;

public class No1110 {

	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);
		String initnum = input.nextLine(); //최초 숫자
		if(Integer.parseInt(initnum)<10) { initnum="0"+initnum;} //미리 0붙여주기

		String temp = ""; int sum=0; int cnt=0; int num=0;

		while( !temp.equals(initnum) ) //첫번째 숫자와 같아질때까지
		{ 
			if(cnt==0) {temp=initnum;}
			num=Integer.parseInt(temp);
			sum= (num/10) + (num%10);
			temp = "" + (num%10) + (sum%10);
			cnt++;
		}
		System.out.println(cnt);
		input.close();

	}

}
