package string1;

import java.util.Scanner;

public class No2941 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc. next();
		System.out.println(str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=","a").length());
	}
}
	