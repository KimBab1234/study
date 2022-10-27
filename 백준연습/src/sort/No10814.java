package sort;

import java.util.*;

public class No10814 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[sc.nextInt()][2];
		sc.nextLine();
		int i=0;
		while(sc.hasNext()) {
			arr[i]=sc.nextLine().split(" ");
			i++;
		}
		
		Arrays.sort(arr, (o1,o2)->{
			int j=Integer.parseInt(o1[0]);
			int k=Integer.parseInt(o2[0]);
			if(j==k) {
				return 0;
			} else {
				return j-k;
			}
		});
		i=0;
		while(i<arr.length) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
			i++;
		}
	}
}