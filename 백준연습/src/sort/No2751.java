package sort;

import java.io.*;
import java.util.*;

public class No2751 {
		public static void main(String[] args) throws IOException{
	        
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt=Integer.parseInt(br.readLine());
			String[] n = new String[cnt];
			for(int i=0; i<cnt;i++) {
				n[i]=br.readLine();
			}
			Arrays.sort(n);
			for(int i=0; i<cnt;i++) {
				System.out.println(n[i]);
			}
	        br.close();
		}
	}
