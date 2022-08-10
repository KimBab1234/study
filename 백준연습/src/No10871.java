import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10871 {

	public static void main(String[] args) throws IOException{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(input.readLine()); //첫번째줄 읽어오기
		
		int N = Integer.parseInt(str.nextToken());
		int X = Integer.parseInt(str.nextToken());
		
		str = new StringTokenizer(input.readLine()); // 2번째줄 읽어오기
		StringBuilder result = new StringBuilder(); //가변스트링 만들기
		int temp=0;
		
		for(int cnt=0; cnt<N; cnt++) {
			
			temp = Integer.parseInt(str.nextToken());
			if(temp<X){ result = result.append(temp+" "); } 

		}
		
		result.deleteCharAt(result.length()-1);
		System.out.printf(result.toString());
		
	}

}
