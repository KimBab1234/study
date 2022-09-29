package sort;

import java.io.*;
import java.util.Arrays;

public class No1181 {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[51];
		String st;
		int i=0,j=0;
		br.readLine();
		while((st=br.readLine())!=null) {
			str[st.length()] = str[st.length()] +st; 
		}
		while(i<51) {
			if(str[i]!=null) {
				String[] str2=new String[str[i].length()/i-1];
				while(j<str2.length) {
					str2[j]=str[i].substring(j*i+4, (i*(j+1))+4);
					j++;
				}
				Arrays.sort(str2);
				j=0;
				while(j<str2.length) {
					if(j>0 && str2[j].equals(str2[j-1])) {
						continue;
					}
					System.out.println(str2[j]);
					j++;
				}
			}
			i++;
		}


	}
}
