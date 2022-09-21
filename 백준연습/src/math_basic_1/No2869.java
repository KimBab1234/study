package math_basic_1;

import java.io.*;
import java.util.StringTokenizer;

public class No2869 {

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(input.readLine());
		int a = Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken()), v=Integer.parseInt(st.nextToken());
		System.out.println((int)Math.ceil((double)(v-b)/(a-b)));
		
	}
}
