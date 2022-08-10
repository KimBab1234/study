import java.io.*;

public class No10952 { //백준에서는 맞았다그러고 내 이클립스에서는 틀렸다고함...

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		/// 입력후 ctrl+z로 EOF입력해줘야함

		String str = ""; 

		while( (str = br.readLine()) != null) { //버퍼는 null값을 반환한다.

			bw.write(Integer.toString(str.charAt(0)+str.charAt(2)-'0'-'0'));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();

	}

}
