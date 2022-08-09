
public class No6_20 {

	public static void main(String[] args) {

		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.printf("최대값: %d%n",max(data));
		System.out.printf("최대값: %d%n",max(new int[] {}));
		System.out.printf("최대값: %d%n",max(null));
	}

	public static int max (int[] arr){


		try { //try, catch로 예외문
			if(arr.length==0 || arr==null) { return -99999; }
			else if(arr.length==1) { return arr[0]; }
			else {

				int result=0;
				result=arr[0];
				for(int cnt=1;cnt<arr.length;cnt++) {

					if(result<arr[cnt]) { result=arr[cnt];}

				}

				return result;
			}

		}

		catch (NullPointerException e) { //에러 발생시 해당 에러는 예외처리해줌

			return -99999;
		}

	}

}
