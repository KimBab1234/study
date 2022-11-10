package dynamic_programming;

import java.util.*;

public class No1912 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max, n, i=0;
		int[] arr=new int[sc.nextInt()+1];
		arr[i++]=max=sc.nextInt();
		while(sc.hasNext()) {
			n=sc.nextInt();
			arr[i]=arr[i-1]+n<n?n:arr[i-1]+n;
			max= max<=0 && max<n? n:max;
			max= arr[i]>max ? arr[i]:max;
			i++;
		}
		System.out.println(max);	
	}
}