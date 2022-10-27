package sort;

import java.util.*;

public class No11651 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer[][] arr = new Integer[sc.nextInt()][2];
		int i=0;
		while(i<arr.length) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
			i++;
		}
		Arrays.sort(arr, (o1,o2)->{
				if(o1[1].equals(o2[1])) {
					return o1[0]-o2[0];
				} else {
					return o1[1]-o2[1];
				}
		});
		i=0;
		while(i<arr.length) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
			i++;
		}

	}

}
