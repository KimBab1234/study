package sort;

import java.util.*;

public class No18870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SortedSet<Integer> s = new TreeSet<Integer>();
		int[] num = new int[sc.nextInt()];
		int i=0, j=0;
		while(sc.hasNext()) {
			j=sc.nextInt();
			s.add(j);
			num[i]=j;
			i++;
		}
		i=0;
		while(i<s.size()) {
			System.out.printf("%d ",s.headSet(num[i]).size());
			i++;
		}
		
		 

	}

}
