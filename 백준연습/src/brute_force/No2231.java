package brute_force;

import java.util.Scanner;

public class No2231 {

	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt(), sum=0, i;
		for(i=0; i<num; i++) {
			if(i+(i/1000000)+((i%1000000)/100000) +((i%100000)/10000) + ((i%10000)/1000) + ((i%1000)/100) + ((i%100)/10) + (i%10)==num) break;
		}
		if(i==num) i=0;
		System.out.println(i);
	}
}
