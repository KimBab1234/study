package dynamic_programming;

import java.util.Scanner;

public class No1463 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    System.out.println(recur(n,0));

	}
	 static int recur(int n,int cnt){
		    if(n<2){
		      return cnt;
		    }
		    return Math.min(recur(n/2,cnt+1+(n%2)),recur(n/3,cnt+1+n%3));

		  }
}