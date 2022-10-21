package set_map;

import java.util.*;

public class No10815 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> s = new HashSet<Integer>();
		int n=sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			s.add(sc.nextInt());
		}
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			int j=0;
			if(s.contains(sc.nextInt())) {
				j=1;
			}
			sb.append(j);
			sb.append(' ');
		}
		System.out.print(sb.toString());
	}
}
