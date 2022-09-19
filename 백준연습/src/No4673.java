public class No4673 {
	static int[] chk = new int[10000];

	public static void main(String[] args) {

		for(int i=1; i<10000; i++) {
			int num = (i/1000) + (i%1000)/100 + (i%100)/10 + (i%10) + i;
			if(num>10000) continue;
			chk[num-1]=num;
		}
		for(int i=1; i<10000; i++) {
			if(chk[i-1]==0) { System.out.println(i); }
		}
	}
}
