package recursion;

import java.io.*;
import java.util.StringTokenizer;

public class No24060 {

	static int cnt, i=0;
	static int[] tmp;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] n = new int[Integer.parseInt(st.nextToken().toString())];
		tmp = new int[n.length];
		cnt=Integer.parseInt(st.nextToken().toString());
		
		st= new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			n[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		mergeSort(n, 0, n.length-1);
		if(cnt>0) i=-1;
		System.out.println(i);
		

	}
	
	static void mergeSort(int[] arr, int l, int r) {
		 
		if (l == r) return;
	    int m = (l + r) / 2;
	    mergeSort(arr, l, m); 
	    mergeSort(arr, m + 1, r);
	    merge(arr, l, m, r);
	}
	
	static void merge(int[] arr, int l, int m, int r){
		  int L, R, k, a;
		    L = l;
		    R = m + 1;
		    k = l;
		 
		    while (L <= m && R <= r)
		        tmp[k++] = arr[L] <= arr[R] ? arr[L++] : arr[R++];
		    
		    
		    if (L>m) 
		        for (a = R; a <= r; a++) tmp[k++] = arr[a];
		    else
		        for (a = L; a <= m; a++) tmp[k++] = arr[a];
		     
		    for (a = l; a <= r; a++) {
		    	arr[a] = tmp[a];
		    	cnt--;
		    	if(cnt==0) {
		    		i=tmp[a];
		    		return;
		    	}
		    }
		     
	}

}
