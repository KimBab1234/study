import java.util.Scanner;

public class No10430 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		char[] ch = str.toCharArray();
		
		int A=0;
		int B=0;
		int C=0;
		int i=0;
		int start=0;
		int cnt=0;
		String temp = "";
		
		for(cnt=0; cnt<ch.length; cnt++) {
			
			if(ch[cnt]==' ' || i==2) {
			
				if(i==2) { temp = str.substring(start, str.length()); C= Integer.parseInt(temp); } 
				else { temp = str.substring(start, cnt); }
				
				if(i==0) { A= Integer.parseInt(temp);}
				if(i==1) { B= Integer.parseInt(temp);}
				
				start = cnt+1;
				i++;
			}
			
		}
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
	}

}
