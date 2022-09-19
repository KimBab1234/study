package string1;

import java.io.IOException;

public class No5622 {

	public static void main(String[] args) throws IOException{
		
		int time =0, temp;
		while(true) {
			temp=System.in.read();
			if(temp<65) {
				break;
			} else if(temp==83 || temp==86 || temp==89 || temp==90 ) {
				time--;
			}
			time += (temp-65)/3 + 3;
		}
		System.out.println(time);
	}
}
