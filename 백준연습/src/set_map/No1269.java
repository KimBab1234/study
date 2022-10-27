package set_map;

import java.util.*;

public class No1269 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> s1= new HashSet<Integer>(), s2= new HashSet<Integer>();
		int n=sc.nextInt(), m=sc.nextInt(), sum=0;
		
		for(int i=0; i<n; i++) {
			s1.add(sc.nextInt());
		}
		for(int i=0; i<m; i++) {
			s2.add(sc.nextInt());
		}
		for(int i:s1) {
			if(s2.contains(i)) {
				sum++;
			}
		}
		System.out.println(n+m-sum*2);
	}
}