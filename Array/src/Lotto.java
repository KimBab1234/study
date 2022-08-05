import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {

		
		int[] num = new int[45];
		int cnt=0;
		
		for(cnt=0; cnt<45; cnt++) {	num[cnt]=cnt+1;	}
		
		int temp =0; int suff =0;
		
		for(cnt=0; cnt<6; cnt++)
		{
			suff=(int)(Math.random()*45);
			
			temp=num[cnt];
			num[cnt]=num[suff];
			num[suff]=temp;
			
		}
		
		int[] rotnum = Arrays.copyOfRange(num, 0, 6); ///0번부터 5번까지 복사
		Arrays.sort(rotnum);
		
		System.out.printf("========당첨 번호========%n");
		System.out.println(Arrays.toString(rotnum));
		
	}

}
