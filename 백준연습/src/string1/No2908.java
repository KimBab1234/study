package string1;

import java.io.IOException;

public class No2908 {

	public static void main(String[] args) throws IOException {
		int num1=System.in.read()-48 + (System.in.read()-48)*10 + (System.in.read()-48)*100;
		System.in.read();
		int num2=System.in.read()-48 + (System.in.read()-48)*10 + (System.in.read()-48)*100;
		if(num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}

}
