package set_map;

import java.util.*;


public class No14425 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<String> s = new HashSet<String>();
		int n= sc.nextInt(), m=sc.nextInt(), cnt=0;
				
		for(int i=0; i<n; i++) {
			s.add(sc.next());
		}
		for(int i=0; i<m; i++) {
			if(s.contains(sc.next())) {
				cnt++;
			}
		}
		System.out.print(cnt);

	}
}
