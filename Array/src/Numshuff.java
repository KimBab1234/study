import java.util.Arrays;

public class Numshuff {

	public static void main(String[] args) {
		
		int[] numarr = { 1,2,3,4,5,6,7,8,9,10,11,12};
		int temp=0;
		int rannum=0;
		
		for(int cnt=0; cnt<100; cnt++)
		{
			rannum=(int)(Math.random()*numarr.length);
			temp=numarr[rannum];
			numarr[rannum]=numarr[0];
			numarr[0]=temp;
		}
		
		System.out.println(Arrays.toString(numarr));
	
	}

}
