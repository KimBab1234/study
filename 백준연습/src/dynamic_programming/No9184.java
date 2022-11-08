package dynamic_programming;

import java.util.Scanner;

public class No9184 {

	static int[][][] num=new int[21][21][21];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			if(a==-1&&b==-1&&c==-1) break;
			System.out.printf("w(%d, %d, %d) = %d\n",a,b,c,w(a,b,c));
		}
	}
	static int w(int a, int b, int c) {
		if(a<=0 || b<=0 || c<=0) return 1;
		else if(a>20 || b>20 || c>20) 
			return num[20][20][20]=w(20,20,20);
		else if(num[a][b][c]!=0)
			return num[a][b][c];
		else if(a<b && b<c)
			return num[a][b][c]=w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		else
			return num[a][b][c]=w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
}