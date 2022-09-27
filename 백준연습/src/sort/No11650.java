package sort;

import java.io.*;
import java.util.*;

public class No11650 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] n = new int[Integer.parseInt(br.readLine())][2];
		int i=0;
		String str;
		StringTokenizer st;
		
		while((str=br.readLine())!=null) {
			st= new StringTokenizer(str);
			n[i][0] = Integer.parseInt(st.nextToken());
			n[i][1] = Integer.parseInt(st.nextToken());
			i++;
		}
		Arrays.sort(n, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o1[1]-o2[1]; 
				}
				return o1[0] - o2[0];
			}
		});
		i=0;
		while(i<n.length) {
			System.out.printf("%d %d%n",n[i][0],n[i][1]);
			i++;
		}
	}
}