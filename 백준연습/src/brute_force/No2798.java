package brute_force;

import java.util.*;

public class No2798 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[sc.nextInt()];
		int sum=sc.nextInt(), ans=0, tem=0, i=0, j, k;
		while(sc.hasNext()) {
			num[i] = sc.nextInt();
			i++;
		}
		i=0;
		for(i=0; i<=num.length-3; i++) {
			for(j=i+1; j<=num.length-2; j++) {
				for(k=j+1; k<=num.length-1; k++) {
					tem=num[i]+num[j]+num[k];
					if(tem > ans && tem <=sum) ans=tem;
				}
			}
		}
		System.out.println(ans);
	}
}
