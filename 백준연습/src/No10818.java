import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10818 {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min=Integer.parseInt(st.nextToken()); int max=min;
		int temp=0;
		for(int cnt=1; cnt<total; cnt++) {
			
			temp=Integer.parseInt(st.nextToken());
			if(min>temp) { min = temp; }
			else if(max<temp) { max = temp; }
			
		}
		
		System.out.printf("%d %d", min, max);
		
		
	}
}

