package set_map;

import java.util.*;

public class No1620 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		String str;

		Map<String, Integer> mm = new HashMap<String, Integer>();
		String[] s = new String[n];
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<n; i++) {
			str=sc.next();
			mm.put(str, i+1);
			s[i]=str;
		}
		while(m-->0) {
			str =sc.next();
			if(str.charAt(0)<58) {
				sb.append(s[Integer.parseInt(str)-1]);
			} else {
				sb.append(mm.get(str));
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());

	}
}
