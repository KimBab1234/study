package set_map;

import java.util.*;

public class No10816 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=sc.nextInt();
		int[] arr = new int[20000001];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<cnt;i++) {
			arr[sc.nextInt()+10000000]++;
		}
		cnt=sc.nextInt();
		for(int i=0; i<cnt;i++) {
			sb.append(arr[sc.nextInt()+10000000]);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
