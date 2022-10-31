package sort;

import java.util.*;
import java.util.Map.Entry;

public class No18870 {
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
		int[] num = new int[sc.nextInt()], rank= new int[num.length];
		int i=0, j=0;
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()) {
			num[i]=rank[i]=sc.nextInt();
			i++;
		}
		Arrays.sort(rank);
		for(i=0; i<num.length; i++) {
			if(!set.containsKey(rank[i])) {
				set.put(rank[i], j);
				j++;
			}
		}
		i=0;
		while(i<rank.length) {
			sb.append(set.get(num[i]));
			sb.append(' ');
			i++;
		}
		System.out.printf(sb.toString());
	}
}