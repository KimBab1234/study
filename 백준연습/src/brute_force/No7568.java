package brute_force;

import java.util.Scanner;

public class No7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[sc.nextInt()][2];
		int i=0, n;
		while(sc.hasNext()) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			i++;
		}
		for(i=0; i<arr.length; i++) {
			n=1;
			for(int j=0; j<arr.length; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					n++;
				}
			}
			System.out.printf("%d ",n);
		}
	}
}
