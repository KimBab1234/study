package recursion;

import java.util.Scanner;

public class No25501 {

	static int i=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.next();
		while(sc.hasNext()) {
			System.out.println(chk(sc.next())+" "+i);
			i=0;
		}
	}
	public static int chk(String s) {
		return re(0,s.length()-1,s);
	}
	public static int re(int s, int e, String s2) {
		i++;
		if(s2.charAt(s)!=s2.charAt(e)) {
			return 0;
		}
		if(e-s<1) return 1;
		return re(s+1, e-1,s2);
	}
}
