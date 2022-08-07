import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No11022 {

	public static void main(String[] args) throws IOException{ //예외처리 필요함

		//버퍼를 이용해 입력을 받음
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		//버퍼는 무조건 스트링으로 고정되어 있음.
		//readLine으로 입력받은 string을 쪼개기 위해 StringTokenizer 객체를 생성하고 인풋으로 넣음
		//쪼갤수 있는 str 스트링 객체 만들어짐
		StringTokenizer str = new StringTokenizer(input.readLine());
		int total= Integer.parseInt(str.nextToken()); //총 갯수
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String temp="";
		
		//공백으로 쪼개주는 nextToken 메서드 사용함
		for(int cnt=0; cnt<total; cnt++) {
			
			str = new StringTokenizer(input.readLine()); //위에 만들어놓은 객체 참조변수 재활용
			int a= Integer.parseInt(str.nextToken());
			int b= Integer.parseInt(str.nextToken());
			temp="Case #"+(cnt+1)+": "+a+" + "+b+" = "+(a+b);
			bw.write(temp);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();


	}
}
