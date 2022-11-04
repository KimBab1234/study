package back_tracking;

import java.util.*;

public class No2580 {

	static boolean end;
	static int[][] num=new int[9][9];

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n;

		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				n=sc.nextInt();
				num[i][j]=n;
			}
		}
		sdoku(0, 0);
	}
	static void sdoku(int row, int col) {

		if(row>8) {
			for(int[] i:num) {
				for(int j: i) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			end=true;
			return;
		} else if(col>8) {
			sdoku(row+1, 0);
		} else {
			if(num[row][col]==0) {
				boolean[] chk = new boolean[10];
				for(int i=0; i<9; i++) {
					chk[num[row][i]]=true;
					chk[num[i][col]]=true;
					chk[num[(row/3)*3+i/3][(col/3)*3+i%3]]=true;
				}
				for(int i=1; i<=9; i++) {
					if(!chk[i]) {
						num[row][col]=i;
						sdoku(row, col+1);
						num[row][col]=0;
					}
					if(end) return;
				}
			} else {
				sdoku(row, col+1);
			}
		}
	}
}