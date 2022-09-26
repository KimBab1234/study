package sort;

import java.io.*;

public class No2108 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine()), n, sum=0,min=0,max=0, mid=0, da=0,i=0;
		int[] cnt = new int[8001];
		boolean midd=false, minn=false, chk=false;
		String str;
		
		while((str=br.readLine())!=null) {
			n=Integer.parseInt(str);
			cnt[n+4000]++;
			sum+=n;
		}
		n=0;
		while(n<t) {
			n+=cnt[i];
			if(n==t) {
				max=i-4001;
			} else if(!midd && n>(t/2)) {
				mid=i-4001;
				midd=true;
			} else if(!minn && n>0) {
				min=i-4001;
				minn=true;
			}
			i++;
		}
		
		for(int j=0; j<8001; j++) {
			if(da<cnt[j]) {
				da=j-4000;
			}
		}
		
		for(int j=0; j<8001; j++) {
			if(!chk && da==cnt[j]) {
				chk=true;
			} else if(chk && da==cnt[j]) {
				da=j-4000;
				break;
			}
		}
	
		System.out.println(Math.round(sum/t));
		System.out.println(mid);
		System.out.println(da);
		System.out.println(max-min);
		
	}

}
