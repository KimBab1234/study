package sort;

import java.util.*;

public class No10814 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[201];
		sc.nextInt();
		String str="";
		int i=0;
		while(sc.hasNext()) {
			i=sc.nextInt();
			str=i + " " + sc.next()+"\n";
			if(arr[i]==null) {
				arr[i]=str;
			} else {
				arr[i]+=str;
			}
		}
		i=0;
		while(i<arr.length) {
			if(arr[i]!=null) {
				System.out.print(arr[i]);
			}
			i++;
		}
	}
}