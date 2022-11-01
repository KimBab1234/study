package geometry;

import java.util.*;

public class No1085 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt(), w=sc.nextInt(), h=sc.nextInt();
		int[] delta = {x, y, w-x, h-y};
		Arrays.sort(delta);
		System.out.println(delta[0]);
	}
}