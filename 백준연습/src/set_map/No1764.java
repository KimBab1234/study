package set_map;

import java.util.*;

public class No1764 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt(), sum=0;
		sc.nextLine();
		String str;
		Set<String> s = new HashSet<String>();
		SortedSet<String> ss= new TreeSet<String>();
		
		for(int i=0; i<n;i++) {
			s.add(sc.next());
		}
		for(int i=0; i<m;i++) {
			str=sc.next();
			if(s.contains(str)) {
				sum++;
				ss.add(str);
			}
		}
		System.out.println(sum);
		for(String i:ss) {
			System.out.println(i);
		}
	}
}