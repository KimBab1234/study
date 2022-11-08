package back_tracking;

import java.util.Scanner;

public class No14888 {

	static int max, min;
	static int[] num;
	static boolean first=false;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		num=new int[n];
		for(int i=0; i<n; i++) {
			num[i]=sc.nextInt();
		}
		int[] arr=new int[4];
		for(int i=0; i<4; i++) {
			arr[i]=sc.nextInt();
		}
		re(arr, 1, num[0]);
		System.out.println(max);
		System.out.println(min);

	}
	static void re(int[] arr, int depth, int sum) {	
		if(depth==num.length) {
			if(!first) {
				min=max=sum;
				first=true;
			} else {
				max= sum>max? sum:max;
				min= sum<min? sum:min;
			}
		} else {
			for(int i=0; i<4; i++) {
				if(arr[i]>0) {
					arr[i]--;
					re(arr,depth+1,math(sum,i,depth));
					arr[i]++;
				}
			}
		}
	}
	static int math(int sum,int i, int j) {
		if(i==0) sum+=num[j];
		if(i==1) sum-=num[j];
		if(i==2) sum*=num[j];
		if(i==3) sum/=num[j];
		return sum;
	}
}
