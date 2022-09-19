package string1;

import java.util.Scanner;

public class No1316 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int cnt=sc.nextInt(), sum=cnt;
		for(int i=0; i<cnt;i++) {
			String str = sc.next();
			Loop :
			for(int j=0; j<str.length(); j++) {
				for(int k=str.lastIndexOf(str.charAt(j)); k>str.indexOf(str.charAt(j));k--) {
					if(str.charAt(k)!=str.charAt(k-1)) {
						sum--;
						break Loop;
					}
				}
			}
		}
		System.out.println(sum);
		
	}

}
