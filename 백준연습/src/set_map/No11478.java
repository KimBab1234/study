package set_map;

import java.util.*;

public class No11478 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<str.length()+1; i++) {
			for(int j=i+1; j<str.length()+1; j++ ) {
				set.add(str.substring(i,j));
			}
		}
		System.out.println(set.size());
	}
}
