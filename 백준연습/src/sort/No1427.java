package sort;

import java.util.*;

public class No1427 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		Arrays.sort(ch);
		for(int i =ch.length-1; i>-1;i--) {
			System.out.printf("%c",ch[i]);
		}
	}
}
