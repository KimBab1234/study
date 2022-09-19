package string1;

import java.io.IOException;

public class No1157 {

	public static void main(String[] args) throws IOException{

		int[] al = new int[26];
		int temp=0,max=0;
		
		while(true) {
			temp=System.in.read();
			if(temp<65) {
				break;
			} else if(temp>90) {
				al[temp-97]++;
			} else {
				al[temp-65]++;
			}
		}
		for(int i=0;i<26;i++) {
			if(max<al[i]) {
				max=al[i];
				temp=i;
			} else if(max==al[i] && max>0) {
				temp=-2;
			}
		}
		System.out.println((char)(temp+65));
		
		
	}

}
