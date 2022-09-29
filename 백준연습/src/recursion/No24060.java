package recursion;

import java.io.*;
import java.util.StringTokenizer;

public class No24060 {

	static int cnt, i=0;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] n = new int[Integer.parseInt(st.nextToken().toString())];
		cnt=Integer.parseInt(st.nextToken().toString());
		
		st= new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			n[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		i=0;
		

	}

}
