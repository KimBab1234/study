package sort;

import java.util.*;

public class No2751 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt=sc.nextInt();
		int[] n = new int[cnt];
		StringBuilder str = new StringBuilder();
		for(int i=0; i<cnt;i++) {
			n[i]=sc.nextInt();
		}
		Arrays.sort(n);
		for(int i=0; i<cnt;i++) {
			str.append(n[i]+"\n");
		}
		System.out.println(str.toString());
	}
}
