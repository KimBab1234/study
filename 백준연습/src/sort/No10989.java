package sort;

import java.io.*;

public class No10989 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] cnt = new int[10001];
		for(int i=Integer.parseInt(br.readLine()); i>0; i--) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=0; i<10001;i++) bw.write((i+"\n").repeat(cnt[i]));
		bw.close();
	}
}
