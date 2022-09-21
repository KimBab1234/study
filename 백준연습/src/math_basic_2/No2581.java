package math_basic_2;

import java.util.Scanner;

public class No2581 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(),sum=-1,min=0;
		loop:
		for(int i=a; i<b+1; i++) {
			if(i==1) continue;
			for(int j=2; j<i; j++) {
				if(i%j==0) continue loop;
			}
			sum+=i;
			if(min==0) min=i;
		}
		System.out.println(sum==-1? -1 : sum+1);
		if(sum>-1)	System.out.println(min);
	}
}
