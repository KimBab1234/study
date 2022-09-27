package sort;

import java.io.*;
import java.util.*;

public class No2108 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine()), n, sum=0,i=0,da=0, daa=0;
		int[] cnt = new int[8001], nn= new int[t];
		boolean chk=false;
		String str;
		
		while((str=br.readLine())!=null) {
			n=Integer.parseInt(str);
			cnt[n+4000]++;
			nn[i]=n;
			sum+=n;
			i++;
		}
		i=n=0;
		Arrays.sort(nn);
		int min=nn[0], max=nn[t-1], mid=nn[t/2];
		for(int j=0; j<8001; j++) { if(da<cnt[j]) { da=cnt[j]; }}
		for(int j=0; j<8001; j++) {
			if(!chk && da==cnt[j]) {
				daa=j-4000;
				chk=true;
			} else if(chk && da==cnt[j]) {
				daa=j-4000;
				break;
			}
		}
		if(sum<0) { n=(int)((double)sum/t-0.5);}
		else { n=(int)Math.round((double)sum/t); }
		str=n+"\n"+mid+"\n"+daa+"\n"+(max-min);
		System.out.println(str);
	}
}
