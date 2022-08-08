
public class No6_17 {

	public static void main(String[] args) {

		int[] original = { 1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}
	
	public static int[] shuffle(int[] arr) {
		
		int temp; int rannum;
		
		for(int cnt=0; cnt<100; cnt++) { //100번 섞기
			
			temp = arr[0];
			rannum=(int)(Math.random()*9);
			arr[0]=arr[rannum];
			arr[rannum]=temp;
			
		}
		
		return arr;
	}

}
