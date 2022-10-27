package sort;

import java.util.*;

public class No1181 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<String> s = new HashSet<String>();
		int i=0;
		sc.nextLine();
		
		while(sc.hasNext()) {
			s.add(sc.next());
		}
		Object[] arr = s.toArray();
		
		Arrays.sort(arr, (o1,o2)->{
			String s1=o1.toString(), s2=o2.toString();
			if(s1.length()==s2.length()) {
				return s1.compareTo(s2);
			} else {
				return s1.length()-s2.length();
			}
		});
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
	}
}